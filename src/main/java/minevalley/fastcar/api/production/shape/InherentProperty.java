package minevalley.fastcar.api.production.shape;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import minevalley.core.api.Core;
import minevalley.core.api.utils.ItemBuilder;
import net.kyori.adventure.text.format.NamedTextColor;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum InherentProperty implements ShapeProperty {
    SCALE("Modell-Skalierung", "c5e72a71efd4842730274612b93a4de6ea0785ea2c724b139b63b6f926d7e24f"),
    BOUNDING_BOX("Bound-Box", "3ed1aba73f639f4bc42bd48196c715197be2712c3b962c97ebf9e9ed8efa025");

    @Getter
    @Nonnull
    private final String displayName;
    private final String skull;

    @Override
    public @Nonnull ItemBuilder getItem() {
        return Core.createItem(skull).setDisplayName(displayName, NamedTextColor.GOLD);
    }
}
