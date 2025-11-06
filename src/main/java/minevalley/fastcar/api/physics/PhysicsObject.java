package minevalley.fastcar.api.physics;

import minevalley.fastcar.api.vehicle.Vehicle;
import org.bukkit.Location;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface PhysicsObject<T extends Vehicle<T>> {

    @Nonnull
    @Contract(pure = true)
    T vehicle();

    /**
     * Get the speed of the object in km/h.
     *
     * @return the speed in km/h
     */
    @Contract(pure = true)
    double getSpeed();

    /**
     * Get the current location of the object.
     *
     * @return the current location
     */
    @Nonnull
    @Contract(pure = true)
    Location getLocation();
}