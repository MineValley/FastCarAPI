package minevalley.fastcar.api.vehicle;

import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnegative;

@SuppressWarnings("unused")
public interface Refuelable {

    /**
     * Gets the fuel level of the vehicle.
     *
     * @return the fuel level (0-1)
     */
    @Nonnegative
    @Contract(pure = true)
    float getFuelLevel();

    /**
     * Sets the fuel level of the vehicle.
     *
     * @param fuelLevel the new fuel level (0-1)
     * @throws IllegalArgumentException if the fuel level is less than 0 or greater than 1
     */
    void setFuelLevel(@Nonnegative float fuelLevel) throws IllegalArgumentException;
}