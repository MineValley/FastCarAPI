package minevalley.fastcar.api.physics;

import org.bukkit.Location;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface PhysicsObject {

    /**
     * Get the speed of the object in km/h.
     *
     * @return the speed in km/h
     */
    double getSpeed();

    /**
     * Get the current location of the object.
     *
     * @return the current location
     */
    @Nonnull
    Location getLocation();
}