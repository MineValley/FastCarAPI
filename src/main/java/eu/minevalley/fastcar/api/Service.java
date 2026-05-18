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

    @Nonnull
    @Contract("_ -> new")
    VisualBuilder createVisual(@Nonnull VehicleBody body) throws IllegalArgumentException;

    @Nonnull
    @Contract("_, _, _ -> new")
    <T extends Vehicle<T>> Vehicle<T> createTemporaryVehicle(@Nonnull Model<T> model,
                                                             @Nonnull String licensePlatePrefix,
                                                             @Nonnull VehicleColor color);
}