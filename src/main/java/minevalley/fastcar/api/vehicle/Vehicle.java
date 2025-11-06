package minevalley.fastcar.api.vehicle;

import minevalley.core.api.Registrant;
import minevalley.fastcar.api.physics.PhysicsObject;
import minevalley.fastcar.api.production.Model;
import minevalley.fastcar.api.production.VehicleColor;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Represents any kind of vehicle (e.g., car, bike, aircraft, motorcycle, ...).
 *
 * @param <T> the type of the physics object
 */
@SuppressWarnings("unused")
public interface Vehicle<T extends PhysicsObject> {

    /**
     * Gets the model of this vehicle.
     *
     * @return the model
     */
    @Nonnull
    @Contract(pure = true)
    Model model();

    /**
     * Gets the color of this vehicle.
     *
     * @return the color
     */
    @Nonnull
    @Contract(pure = true)
    VehicleColor getColor();

    /**
     * Gets the physics object associated with this vehicle.
     * <p>
     * <b>Note:</b> This may return null if the vehicle is not currently spawned in the world. This is the case for new vehicles and for vehicles that have been towed.
     *
     * @return the physics object
     */
    @Nullable
    @Contract(pure = true)
    T physicsObject();

    /**
     * Sets the color of this vehicle.
     *
     * @param color the new color
     * @throws IllegalArgumentException if the color is null or not available for this vehicle's model
     */
    void changeColor(@Nonnull VehicleColor color) throws IllegalArgumentException;

    /**
     * Gets the owner of this vehicle.
     *
     * @return the owner
     */
    @Nonnull
    @Contract(pure = true)
    Registrant getOwner();
}
