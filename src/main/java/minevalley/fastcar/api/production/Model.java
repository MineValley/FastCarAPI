package minevalley.fastcar.api.production;

import minevalley.fastcar.api.production.shape.Addon;
import minevalley.fastcar.api.production.shape.Attachment;
import minevalley.fastcar.api.production.shape.Seat;
import minevalley.fastcar.api.production.shape.VehicleComponent;
import minevalley.fastcar.api.vehicle.Vehicle;
import org.bukkit.Material;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;
import java.util.Set;

/**
 * A vehicle model represents a specific design or version of a vehicle produced by a manufacturer.
 * Every vehicle has a model. All vehicles of the same model share its common characteristics and features.
 */
@SuppressWarnings("unused")
public interface Model<T extends Vehicle<T>> {

    @Nonnull
    @Contract(pure = true)
    Class<? extends T> vehicleClass();

    /**
     * Gets the name of this model.
     *
     * @return The model name.
     */
    @Nonnull
    @Contract(pure = true)
    String name();

    /**
     * Gets the manufacturer of this model.
     *
     * @return The manufacturer.
     */
    @Nonnull
    @Contract(pure = true)
    Manufacturer manufacturer();

    /**
     * Gets the base material of this model.
     *
     * @return The material.
     * @see #customModelData()
     */
    @Nonnull
    @Contract(pure = true)
    Material material();

    /**
     * Gets the custom model data of this model.
     *
     * @return The custom model data.
     * @see #material()
     */
    @Contract(pure = true)
    int customModelData();

    /**
     * Gets the attachments of this model.
     *
     * @return The set of attachments.
     */
    @Nonnull
    @Contract(pure = true)
    Set<Attachment> attachments();

    /**
     * Gets the seats of this model.
     *
     * @return The set of seats.
     */
    @Nonnull
    @Contract(pure = true)
    Set<Seat> seats();

    /**
     * Gets the total amount of seats of this model.
     *
     * @return The amount of seats
     */
    @Contract(pure = true)
    int seatCount();

    /**
     * Gets the addons of this model.
     *
     * @return The set of addons.
     */
    @Nonnull
    @Contract(pure = true)
    Set<Addon> addons();

    /**
     * Gets all components of this model.
     *
     * @return The set of components.
     */
    @Nonnull
    @Contract(pure = true)
    Set<VehicleComponent> components();

    /**
     * Checks if this model has a roof.
     * This is naturally false for all kinds of motorcycles, bikes, scooters, etc.
     *
     * @return True if it has a roof, false otherwise.
     */
    @Contract(pure = true)
    boolean hasRoof();

    /**
     * Gets this model's air resistance factor, where higher values mean more air resistance, the lowest possible value is 0 and the default is 1.0.
     *
     * @return The air resistance factor
     */
    @Contract(pure = true)
    float airResistance();

    /**
     * Gets this model's mass in kilograms.
     *
     * @return The mass.
     */
    @Contract(pure = true)
    int mass();

    /**
     * Gets the brake force of this model, where higher values mean stronger braking, the lowest possible value is 0 and the default is 1.0.
     * <p>
     * <b>Note:</b> This force is still affected by the tires' grip and the air resistance.
     *
     * @return The brake force.
     */
    @Contract(pure = true)
    float brakeForce();
}
