package eu.minevalley.fastcar.api.vehicle;

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
public record LicensePlate(@Nonnull String raw) {

    /**
     * Checks whether this license plate indicates a fraction vehicle.
     *
     * @return true, if license plate indicates a fraction vehicle
     */
    @Contract(pure = true)
    boolean isFractionPlate() {
        return isPolicePlate() || isMedicPlate();
    }

    /**
     * Checks whether this license plate indicates a police vehicle.
     *
     * @return true, if license plate indicates a police vehicle
     */
    @Contract(pure = true)
    boolean isPolicePlate() {
        return raw.startsWith("PO");
    }

    /**
     * Checks whether this license plate indicates a medic vehicle.
     *
     * @return true, if license plate indicates a medic vehicle
     */
    @Contract(pure = true)
    boolean isMedicPlate() {
        return raw.startsWith("RD");
    }

    /**
     * Checks if the license plate is a team plate
     * <p>
     * Team plates start with TE AM
     *
     * @return true if it is a team plate, false otherwise
     */
    @Contract(pure = true)
    boolean isTeamPlate() {
        return raw.startsWith("TE-AM");
    }

    /**
     * Checks whether the license plate indicates a temporary vehicle
     *
     * @return true, if the license plate indicates a temporary vehicle
     * @see Vehicle#isTemporary()
     */
    @Contract(pure = true)
    boolean isTemporary() {
        return !raw.startsWith("MV");
    }

    /**
     * Checks if the license plate is for an electric vehicle
     * <p>
     * Electric vehicle plates end with E
     * <p>
     * <b>Note:</b> This method says nothing about whether the vehicle actually is electric! This just checks whether the license plate contains the E-indicator!
     *
     * @return true if it is an electric vehicle plate, false otherwise
     */
    @Contract(pure = true)
    public boolean isElectric() {
        return raw.endsWith("E");
    }

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
    public String toString() {
        return raw.replace("-", " ");
    }
}
