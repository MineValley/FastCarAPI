package minevalley.fastcar.api.administration;

import minevalley.core.api.users.User;
import minevalley.fastcar.api.physics.PhysicsObject;
import minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Penalties can be issued by the police for various infractions, such as parking violations or traffic offenses.
 */
@SuppressWarnings("unused")
public interface Penalty {

    /**
     * The reason for the penalty.
     *
     * @return the reason
     */
    @Nonnull
    @Contract(pure = true)
    Reason reason();

    /**
     * The user who received the penalty.
     * <b>Note:</b> In most cases, this is the driver. In case of parking violations, this is the last driver.
     *
     * @return the online user
     */
    @Nonnull
    @Contract(pure = true)
    User user();

    /**
     * The issuer of the penalty. If null, the penalty was issued by the system (e.g., automated speed camera).
     *
     * @return the issuer or null if issued by system
     * @see #isIssuedBySystem()
     */
    @Nullable
    @Contract(pure = true)
    User issuer();

    /**
     * Whether the penalty was issued by the system (e.g., automated speed camera).
     *
     * @return true if issued by system, false otherwise
     * @see #issuer()
     */
    @Contract(pure = true)
    default boolean isIssuedBySystem() {
        return issuer() == null;
    }

    /**
     * The vehicle involved in the penalty.
     *
     * @return the vehicle
     */
    @Nonnull
    @Contract(pure = true)
    Vehicle<? extends PhysicsObject> vehicle();

    /**
     * The amount of the penalty in cents.
     *
     * @return amount in cents
     */
    @Contract(pure = true)
    int amountInCents();

    /**
     * Whether the penalty has been paid.
     *
     * @return true if paid, false otherwise
     */
    @Contract(pure = true)
    boolean paid();

    enum Reason {
        SPEEDING,
        PARKING_VIOLATION,
        RED_LIGHT_VIOLATION,
        OTHER
    }
}
