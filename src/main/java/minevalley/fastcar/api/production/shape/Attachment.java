package minevalley.fastcar.api.production.shape;

import minevalley.core.api.utils.ItemBuilder;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Attachment {

    @Nonnull
    String getDisplayName();

    @Nonnull
    ItemBuilder getItem();
}
