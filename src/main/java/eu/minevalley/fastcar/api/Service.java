package eu.minevalley.fastcar.api;

import eu.minevalley.fastcar.api.characteristics.Model;
import eu.minevalley.fastcar.api.characteristics.VehicleBody;
import eu.minevalley.fastcar.api.characteristics.VehicleColor;
import eu.minevalley.fastcar.api.vehicle.Vehicle;
import eu.minevalley.fastcar.api.visual.VisualBuilder;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Service {

    /**
     * Creates a visual builder which can then be built into a visual.
     *
     * @param body body to define the looking of the visual from
     * @return newly created visual builder
     * @throws IllegalArgumentException if the body is null
     */
    @Nonnull
    @Contract("_ -> new")
    VisualBuilder createVisual(@Nonnull VehicleBody body) throws IllegalArgumentException;

    /**
     * Creates a temporary vehicle that will be automatically removed upon the next restart.
     *
     * @param model              model of the vehicle
     * @param licensePlatePrefix the prefix of the license plate. Based on that the system creates a license plate. This is not supposed to be MV!
     * @param color              color of the vehicle
     * @param <T>                the type of vehicle (VehicleClass)
     * @return newly created (but not yet spawned!) vehicle
     * @throws IllegalArgumentException if the model, the licensePlatePrefix or the color is null or if the color is not supported by the model.
     */
    @Nonnull
    @Contract("_, _, _ -> new")
    <T extends Vehicle<T>> Vehicle<T> createTemporaryVehicle(@Nonnull Model<T> model,
                                                             @Nonnull String licensePlatePrefix,
                                                             @Nonnull VehicleColor color)
            throws IllegalArgumentException;

    /**
     * Creates a temporary vehicle that will be automatically removed upon the next restart.
     *
     * @param model              model of the vehicle
     * @param licensePlatePrefix the prefix of the license plate. Based on that the system creates a license plate. This is not supposed to be MV!
     * @param <T>                the type of vehicle (VehicleClass)
     * @return newly created (but not yet spawned!) vehicle
     * @throws IllegalArgumentException if the model, the licensePlatePrefix or the color is null.
     */
    @Nonnull
    @Contract("_, _ -> new")
    default <T extends Vehicle<T>> Vehicle<T> createTemporaryVehicle(@Nonnull Model<T> model,
                                                                     @Nonnull String licensePlatePrefix)
            throws IllegalArgumentException {
        return createTemporaryVehicle(model, licensePlatePrefix, model.body().defaultColors()[0]);
    }
}