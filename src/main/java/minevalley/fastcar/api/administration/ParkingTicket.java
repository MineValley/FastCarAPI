package minevalley.fastcar.api.administration;

import minevalley.core.api.users.User;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

/**
 * Represents a parking ticket that can be purchased to park vehicles in restricted areas.
 *
 * <p>Semantics:
 * <ul>
 *   <li>{@link #startTime()} returns the epoch timestamp in milliseconds (as produced by {@link System#currentTimeMillis()})
 *       of the ticket issuance or — if the ticket has been marked paid — the timestamp of the last payment.</li>
 *   <li>{@link #wasPaid()} indicates whether the ticket has been marked as paid since issuance.
 *       It does not express the temporal validity of the payment (see {@link #allowsToLeave()}).</li>
 *   <li>{@link #allowsToLeave()} uses a default leeway of {@link #LEEWAY_IN_MINUTES} minutes to decide
 *       whether a vehicle is allowed to leave the parking spot after payment.</li>
 * </ul>
 */
@SuppressWarnings("unused")
public interface ParkingTicket {

    /**
     * Default leeway in minutes within which a payment is considered to allow leaving the parking spot.
     */
    int LEEWAY_IN_MINUTES = 5;

    /**
     * The timestamp (epoch milliseconds) of ticket issuance or of the last payment if the ticket was paid.
     *
     * @return epoch milliseconds (>= 0)
     */
    @Contract(pure = true)
    long startTime();

    /**
     * Returns the elapsed time since {@link #startTime()} in whole minutes.
     * Negative differences (for example if {@link #startTime()} is in the future) are clamped to 0.
     *
     * @return number of whole minutes since {@link #startTime()} (non\-negative)
     */
    @Contract(pure = true)
    default long getUnpaidTimeInMinutes() {
        long diffMillis = System.currentTimeMillis() - startTime();
        if (diffMillis <= 0L) {
            return 0L;
        }
        return Math.floorDiv(diffMillis, 60_000L);
    }

    /**
     * The user who issued the ticket.
     *
     * @return issuing user
     */
    @Nonnull
    @Contract(pure = true)
    User getUser();

    /**
     * Marks this ticket as paid.
     */
    void markAsPaid();

    /**
     * Returns whether this ticket was marked as paid since issuance.
     *
     * <p>Note: a ticket that was paid may still be invalid if the payment occurred more than
     * {@link #LEEWAY_IN_MINUTES} minutes ago.
     * Use {@link #allowsToLeave()} to verify ifthe vehicle is actually allowed to leave.
     *
     * @return {@code true} if the ticket was marked paid, {@code false} otherwise
     */
    boolean wasPaid();

    /**
     * Checks whether the vehicle is allowed to leave the parking spot.
     * By default, a payment is considered sufficient if the unpaid elapsed time
     * is less than {@link #LEEWAY_IN_MINUTES}.
     *
     * @return {@code true} if unpaid elapsed minutes are less than {@link #LEEWAY_IN_MINUTES}, {@code false} otherwise
     */
    @Contract(pure = true)
    default boolean allowsToLeave() {
        return getUnpaidTimeInMinutes() < LEEWAY_IN_MINUTES;
    }

    /**
     * Checks whether the vehicle is allowed to leave using a custom leeway in minutes.
     *
     * @param leewayMinutes leeway in minutes (must be >= 0)
     * @return {@code true} if unpaid elapsed minutes are less than {@code leewayMinutes}
     * @throws IllegalArgumentException if {@code leewayMinutes} is negative
     */
    @Contract(pure = true)
    default boolean allowsToLeave(int leewayMinutes) {
        if (leewayMinutes < 0) {
            throw new IllegalArgumentException("leewayMinutes must be >= 0");
        }
        return getUnpaidTimeInMinutes() < leewayMinutes;
    }
}
