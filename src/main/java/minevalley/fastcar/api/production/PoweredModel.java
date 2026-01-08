package minevalley.fastcar.api.production;

import org.jetbrains.annotations.Contract;

@SuppressWarnings("unused")
public interface PoweredModel {

    /**
     * Gets the power of this model in horsepower (HP).
     *
     * @return The power.
     * @see #powerInKilowatts()
     */
    @Contract(pure = true)
    int powerInHorsepower();

    /**
     * Gets the power of this model in kilowatts (kW).
     *
     * @return The power.
     * @see #powerInHorsepower()
     */
    @Contract(pure = true)
    default int powerInKilowatts() {
        return Math.round(powerInHorsepower() * 0.7457f);
    }
}
