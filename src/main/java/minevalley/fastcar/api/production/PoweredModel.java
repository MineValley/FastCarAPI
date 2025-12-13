package minevalley.fastcar.api.production;

import minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

@SuppressWarnings("unused")
public interface PoweredModel<T extends Vehicle<T>> extends Model<T> {

    /**
     * Gets the power of this model in horsepower (HP).
     *
     * @return The power.
     * @see #powerInKilowatts()
     */
    @Contract(pure = true)
    int powerInHorsePower();

    /**
     * Gets the power of this model in kilowatts (kW).
     *
     * @return The power.
     * @see #powerInHorsePower()
     */
    @Contract(pure = true)
    default int powerInKilowatts() {
        return Math.round(powerInHorsePower() * 0.7457f);
    }
}
