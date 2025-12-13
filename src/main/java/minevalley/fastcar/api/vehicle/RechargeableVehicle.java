package minevalley.fastcar.api.vehicle;

import minevalley.fastcar.api.production.RechargeableModel;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface RechargeableVehicle {

    /**
     * Gets the rechargeable model of the vehicle.
     *
     * @return the rechargeable model
     */
    @Nonnull
    @Contract(pure = true)
    RechargeableModel model();

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
    void setChargeLevel(@Nonnegative float chargeLevel) throws IllegalArgumentException;
}
