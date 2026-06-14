package eu.minevalley.fastcar.api.characteristics.body;

import eu.minevalley.core.api.item.ItemBuilder;
import eu.minevalley.fastcar.api.FastCar;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.kyori.adventure.text.format.NamedTextColor;

import javax.annotation.Nonnull;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum Seat implements Attachment {

    DRIVER(0, "Fahrer", "Fahrersitz"),
    CO_DRIVER(0, "Beifahrer", "Beifahrersitz"),
    MIDDLE_LEFT(0, "Mitte links", "Sitz links in der Mitte"),
    MIDDLE_MIDDLE(0, "Mitte mitte", "Sitz mittig in der Mitte"),
    MIDDLE_RIGHT(0, "Mitte rechts", "Sitz rechts in der Mitte"),
    BACK_LEFT(0, "Hinten links", "Sitz hinten links"),
    BACK_MIDDLE(0, "Hinten mittig", "Sitz hinten mittig"),
    BACK_RIGHT(0, "Hinten rechts", "Sitz hinten rechts"),
    AMBULANCE_FOLDING_SEAT(90, "RTW-Klappsitz", "aufklappbaren Sitz");

    private final float rotation;
    private final @Nonnull String displayName;
    private final @Nonnull String niceName;

    @Override
    @Nonnull
    public ItemBuilder getItem() {
        return FastCar.core().createItem(
                this == DRIVER
                        ? "142120ec49499309c1e7935b84ad779918a882331b24410f5a873c9fa895ebaf"
                        : "1266462350ec26549193f6eef4fc6036bbd0d4fb25853afd8cae9685bc44ebc8"
        ).setDisplayName(displayName, NamedTextColor.YELLOW);
    }
}
