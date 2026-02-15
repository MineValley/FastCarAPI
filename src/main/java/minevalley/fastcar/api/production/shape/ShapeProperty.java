package minevalley.fastcar.api.production.shape;

import minevalley.core.api.utils.ItemBuilder;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface ShapeProperty {

    @Nonnull
    String getDisplayName();

    @Nonnull
    ItemBuilder getItem();
}
