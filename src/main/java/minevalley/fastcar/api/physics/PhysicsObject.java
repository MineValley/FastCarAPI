package minevalley.fastcar.api.physics;

import minevalley.core.api.users.OnlineUser;
import minevalley.fastcar.api.vehicle.Vehicle;
import org.bukkit.Location;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Set;

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

    /**
     * Get the driver of the vehicle, if any.
     *
     * @return the driver, or null if there is no driver
     */
    @Nullable
    @Contract(pure = true)
    OnlineUser getDriver();

    /**
     * Get the passengers of the vehicle, including the driver.
     *
     * @return the set of passengers
     */
    @Nonnull
    @Contract(pure = true)
    Set<OnlineUser> getPassengers();

    /**
     * Get the current location of the object.
     *
     * @return the current location
     */
    @Nonnull
    @Contract(pure = true)
    Location getLocation();

    /**
     * Get the speed of the object in km/h.
     *
     * @return the speed in km/h
     */
    @Contract(pure = true)
    float getSpeed();
}