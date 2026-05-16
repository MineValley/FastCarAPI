package eu.minevalley.fastcar.api;

import eu.minevalley.fastcar.api.characteristics.VehicleBody;
import eu.minevalley.fastcar.api.visual.VisualBuilder;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Service {

    @Nonnull
    @Contract("_ -> new")
    VisualBuilder createVisual(@Nonnull VehicleBody body) throws IllegalArgumentException;
}