package eu.minevalley.fastcar.api.physics;

import eu.minevalley.fastcar.api.vehicle.Vehicle;
import eu.minevalley.fastcar.api.visual.Visual;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface PhysicsObject<T extends Vehicle<T>> {

    /**
     * Get the vehicle associated with this physics object.
     *
     * @return the vehicle
     */
    @Nonnull
    @Contract(pure = true)
    T vehicle();

    @Nonnull
    @Contract(pure = true)
    Visual visual();

    /**
     * Get the speed of the object in km/h.
     *
     * @return the speed in km/h
     */
    @Contract(pure = true)
    float getSpeed();
}