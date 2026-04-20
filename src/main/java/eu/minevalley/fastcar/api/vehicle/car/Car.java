package eu.minevalley.fastcar.api.vehicle.car;

import eu.minevalley.fastcar.api.characteristics.Tire;
import eu.minevalley.fastcar.api.characteristics.type.car.CarModel;
import eu.minevalley.fastcar.api.vehicle.StorageVehicle;
import eu.minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Car<T extends Car<T>> extends Vehicle<T>, StorageVehicle {

    @Nonnull
    @Contract(pure = true)
    @Override
    CarModel<T> model();

    /**
     * Gets the tires of this vehicle.
     *
     * @return the tires
     */
    @Nonnull
    @Contract(pure = true)
    Tire tires();

    /**
     * The current tire durability of the vehicle.
     * When this reaches 0, the tires need to be replaced.
     *
     * @return the tire durability
     * @see Tire#durability()
     */
    @Contract(pure = true)
    int tireDurability();

    /**
     * Decreases the tire durability by the specified amount.
     * If the amount is greater than the current durability, the durability will be set to 0.
     *
     * @param amount the amount to decrease
     * @throws IllegalArgumentException if the amount is negative
     */
    void decreaseTireDurability(@Nonnegative int amount) throws IllegalArgumentException;
}
