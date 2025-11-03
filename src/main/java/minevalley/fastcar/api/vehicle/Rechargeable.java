package minevalley.fastcar.api.vehicle;

import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnegative;

@SuppressWarnings("unused")
public interface Rechargeable {

    /**
     * Gets the charge level of the vehicle.
     *
     * @return the charge level (0-1)
     */
    @Nonnegative
    @Contract(pure = true)
    float getChargeLevel();

    /**
     * Sets the charge level of the vehicle.
     *
     * @param chargeLevel the new charge level (0-1)
     * @throws IllegalArgumentException if the charge level is less than 0 or greater than 1
     */
    void setFuelLevel(@Nonnegative float chargeLevel) throws IllegalArgumentException;
}
