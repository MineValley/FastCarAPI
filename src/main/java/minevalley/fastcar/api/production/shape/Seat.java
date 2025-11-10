package minevalley.fastcar.api.production.shape;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import minevalley.core.api.Core;
import minevalley.core.api.utils.ItemBuilder;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

import javax.annotation.Nonnull;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum Seat implements Attachment {

    DRIVER(0, "Fahrer"),
    CO_DRIVER(0, "Beifahrer"),
    MIDDLE_LEFT(0, "Mitte links"),
    MIDDLE_MIDDLE(0, "Mitte mitte"),
    MIDDLE_RIGHT(0, "Mitte rechts"),
    BACK_LEFT(0, "Hinten links"),
    BACK_MIDDLE(0, "Hinten mitte"),
    BACK_RIGHT(0, "Hinten rechts"),
    AMBULANCE_FOLDING_SEAT(90, "RTW-Klappsitz");

    private final float rotation;
    private final @Nonnull String displayName;

    @Override
    @Nonnull
    public ItemBuilder getItemStack() {
        return Core.createItem(
                this == DRIVER
                        ? "142120ec49499309c1e7935b84ad779918a882331b24410f5a873c9fa895ebaf"
                        : "1266462350ec26549193f6eef4fc6036bbd0d4fb25853afd8cae9685bc44ebc8"
        ).setDisplayName(Component.text(displayName, NamedTextColor.YELLOW));
    }
}
