package minevalley.fastcar.api.characteristics.body;

import eu.minevalley.proxima.api.item.ItemBuilder;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface ShapeProperty {

    /**
     * Gets the display name of this shape property, which is used for example in the production menu.
     *
     * @return the display name of this shape property
     */
    @Nonnull
    @Contract(pure = true)
    String getDisplayName();

    /**
     * Gets the item representation of this shape property, which is used for example in the production menu.
     *
     * @return the item representation of this shape property
     */
    @Nonnull
    @Contract(pure = true)
    ItemBuilder getItem();
}
