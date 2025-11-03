package minevalley.fastcar.api.vehicle;

import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

/**
 * Represents a vehicle that has a license plate (e.g., cars, motorcycles, helicopters, ...).
 */
@SuppressWarnings("unused")
public interface Licensed {

    @Nonnull
    @Contract(pure = true)
    String licensePlate();
}
