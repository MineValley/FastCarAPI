package minevalley.fastcar.api.production;

import minevalley.fastcar.api.vehicle.car.Car;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Tire {

    /**
     * The name of the tire.
     *
     * @return the tire name
     */
    @Nonnull
    @Contract(pure = true)
    String name();

    /**
     * The manufacturer of the tire.
     *
     * @return the tire manufacturer
     */
    @Nonnull
    @Contract(pure = true)
    Manufacturer manufacturer();

    /**
     * The grip factor of the tire.
     * A higher value means more grip.
     *
     * @return the grip factor (0.0 - 1.0)
     */
    @Contract(pure = true)
    float gripFactor();

    /**
     * The speed factor of the tire.
     * A higher value means higher speed.
     * 1.0 means no speed reduction.
     *
     * @return the speed factor (0.0 - 1.0)
     */
    @Contract(pure = true)
    float speedFactor();

    /**
     * The durability factor of the tire.
     * A higher value means more durability.
     *
     * @return the durability factor (0.0 - 1.0)
     */
    @Contract(pure = true)
    float durabilityFactor();

    /**
     * The durability of the tire when new.
     * Every driven kilometer and every accident reduces the durability.
     * The higher the value, the longer the tire lasts.
     *
     * @return the durability
     * @see Car#tireDurability()
     */
    @Contract(pure = true)
    int durability();
}
