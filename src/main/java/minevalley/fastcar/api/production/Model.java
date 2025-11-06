package minevalley.fastcar.api.production;

import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

/**
 * A vehicle model represents a specific design or version of a vehicle produced by a manufacturer.
 * Every vehicle has a model. All vehicles of the same model share its common characteristics and features.
 */
@SuppressWarnings("unused")
public interface Model {

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
}
