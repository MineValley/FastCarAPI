package minevalley.fastcar.api.characteristics;

import minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

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
     * <p>
     * <b>Note:</b> This can be set individually per model, but if not set, this is the name given to the {@link VehicleBody}.
     *
     * @return The model name.
     */
    @Nonnull
    @Contract(pure = true)
    String name();

    /**
     * Gets the body used for this model.
     *
     * @return body of this model
     */
    @Nonnull
    @Contract(pure = true)
    VehicleBody body();

    /**
     * Gets the manufacturer of this model.
     *
     * @return The manufacturer.
     */
    @Nonnull
    @Contract(pure = true)
    Manufacturer manufacturer();

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
