package minevalley.fastcar.api.production;

import org.jetbrains.annotations.Contract;

@SuppressWarnings("unused")
public interface PoweredModel extends Model {

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
