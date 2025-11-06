package minevalley.fastcar.api.administration;

import org.jetbrains.annotations.Contract;

/**
 * Parking tickets can be bought to park vehicles in restricted areas.
 * If the police finds a vehicle parked in a restricted area without a valid parking ticket they can issue a {@link Penalty}.
 */
@SuppressWarnings("unused")
public interface ParkingTicket {

    /**
     * The time the parking ticket was issued in milliseconds since the epoch.
     *
     * @return time issued in milliseconds since epoch
     */
    @Contract(pure = true)
    long timeIssued();

    /**
     * The time until the parking ticket is valid in milliseconds since the epoch.
     *
     * @return time until valid in milliseconds since epoch
     */
    @Contract(pure = true)
    long validUntil();

    /**
     * The duration the parking ticket is valid for in milliseconds.
     *
     * @return duration in milliseconds
     */
    @Contract(pure = true)
    default long validDuration() {
        return validUntil() - timeIssued();
    }
}
