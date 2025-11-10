package minevalley.fastcar.api.physics;

import minevalley.core.api.users.OnlineUser;
import minevalley.fastcar.api.production.shape.Addon;
import minevalley.fastcar.api.production.shape.Seat;
import minevalley.fastcar.api.vehicle.Vehicle;
import org.bukkit.Location;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;
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
     * Get a map of all occupied seats and their corresponding occupants.
     * <p>
     * <b>Note:</b> This map only includes seats that are currently occupied, including the driver seat if occupied.
     *
     * @return a map of occupied seats to their occupants
     */
    @Nonnull
    @Contract(pure = true)
    Map<Seat, OnlineUser> getPassengers();

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

    /**
     * Get a set of all addons currently attached to the vehicle.
     *
     * @return a set of attached addons
     */
    @Nonnull
    @Contract(pure = true)
    Set<Addon> getAttachedAddons();
}