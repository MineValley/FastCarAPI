package minevalley.fastcar.api.production;

import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;
import java.util.Set;

@SuppressWarnings("unused")
public interface Manufacturer {

    /**
     * Gets the name of this manufacturer.
     *
     * @return The manufacturer name.
     */
    @Nonnull
    @Contract(pure = true)
    String name();

    /**
     * Gets all models of this manufacturer.
     *
     * @return The set of models.
     */
    @Nonnull
    @Contract(pure = true)
    Set<Model> models();
}
