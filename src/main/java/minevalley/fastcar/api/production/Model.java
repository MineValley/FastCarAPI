package minevalley.fastcar.api.production;

import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

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
