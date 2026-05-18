package eu.minevalley.fastcar.api.vehicle;

import eu.minevalley.fastcar.api.characteristics.Model;
import eu.minevalley.fastcar.api.characteristics.VehicleColor;
import eu.minevalley.fastcar.api.physics.PhysicsObject;
import eu.minevalley.proxima.api.Registrant;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Represents any kind of vehicle (e.g., car, bike, aircraft, motorcycle, ...).
 *
 * @param <T> the type of the physics object
 */
@SuppressWarnings("unused")
public interface Vehicle<T extends Vehicle<T>> {

    /**
     * Gets the license plate of this vehicle.
     * Every vehicle has a unique license plate.
     *
     * @return the license plate
     */
    @Nonnull
    @Contract(pure = true)
    LicensePlate licensePlate();

    /**
     * Gets the model of this vehicle.
     *
     * @return the model
     */
    @Nonnull
    @Contract(pure = true)
    Model<T> model();

    /**
     * Gets the physics object associated with this vehicle.
     * <p>
     * <b>Note:</b> This may return null if the vehicle is not currently spawned in the world. This is the case for new vehicles and for vehicles that have been towed.
     *
     * @return the physics object
     */
    @Nullable
    @Contract(pure = true)
    PhysicsObject<T> physicsObject();

    /**
     * Gets the color of this vehicle.
     *
     * @return the color
     */
    @Nonnull
    @Contract(pure = true)
    VehicleColor getColor();

    /**
     * Sets the color of this vehicle.
     *
     * @param color the new color
     * @throws IllegalArgumentException if the color is null or not available for this vehicle's model
     */
    void changeColor(@Nonnull VehicleColor color) throws IllegalArgumentException;

    /**
     * Gets the owner of this vehicle.
     * <p>
     * <b>Note:</b> Not all vehicles have owners! Temporary vehicles (those of fractions, quests, the team, ...) do not have an owner and will return null.
     *
     * @return the owner, if existing
     */
    @Nullable
    @Contract(pure = true)
    Registrant getOwner();

    /**
     * Checks whether this vehicle is temporary.
     *
     * @return true, if the vehicle is temporary
     */
    @Contract(pure = true)
    boolean isPermanent();
}
