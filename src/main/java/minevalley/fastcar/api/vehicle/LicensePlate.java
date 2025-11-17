package minevalley.fastcar.api.vehicle;

import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

/**
 * Represents a license plate of a vehicle.
 * <p>
 * Team plates start with <code>TE AM</code>.<br>
 * Bike plates start with <code>BI KE</code>.<br>
 * Every other plate starts with <code>MV</code><br>
 * Electric vehicle plates end with <code>E</code>.
 */
@SuppressWarnings("unused")
public interface LicensePlate {

    /**
     * Checks if the license plate is a team plate
     * <p>
     * Team plates start with TE AM
     *
     * @return true if it is a team plate, false otherwise
     */
    @Contract(pure = true)
    boolean isTeamPlate();

    /**
     * Checks if the license plate is for a bike
     * <p>
     * Bike plates start with BI KE
     *
     * @return true if it is a bike plate, false otherwise
     */
    @Contract(pure = true)
    boolean isBike();

    /**
     * Checks if the license plate is for an electric vehicle
     * <p>
     * Electric vehicle plates end with E
     *
     * @return true if it is an electric vehicle plate, false otherwise
     */
    @Contract(pure = true)
    boolean isElectric();

    /**
     * Returns the raw string representation of the license plate as stored in the database
     *
     * @return the raw license plate string
     * @see #toString()
     */
    @Nonnull
    @Contract(pure = true)
    String raw();

    /**
     * Returns the string representation of the license plate
     * <p>
     * <b>Note:</b> This returns the nice formatted version with spaces, not the database version
     *
     * @return the license plate as string
     * @see #raw()
     */
    @Override
    @Nonnull
    @Contract(pure = true)
    String toString();
}
