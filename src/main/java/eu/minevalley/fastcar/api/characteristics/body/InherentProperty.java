package eu.minevalley.fastcar.api.characteristics.body;

import eu.minevalley.proxima.api.Proxima;
import eu.minevalley.proxima.api.item.ItemBuilder;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum InherentProperty implements ShapeProperty {
    SCALE(
            "Modell-Skalierung",
            "c5e72a71efd4842730274612b93a4de6ea0785ea2c724b139b63b6f926d7e24f",
            NamedTextColor.GREEN
    ),
    BOUNDING_BOX(
            "Bounding-Box",
            "3ed1aba73f639f4bc42bd48196c715197be2712c3b962c97ebf9e9ed8efa025",
            NamedTextColor.RED
    );

    @Getter
    @Nonnull
    private final String displayName;
    private final String skull;
    private final TextColor color;

    @Override
    public @Nonnull ItemBuilder getItem() {
        return Proxima.createItem(skull).setDisplayName(displayName, color);
    }
}
