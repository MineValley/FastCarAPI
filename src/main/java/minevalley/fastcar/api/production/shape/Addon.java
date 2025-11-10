package minevalley.fastcar.api.production.shape;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import minevalley.core.api.Core;
import minevalley.core.api.utils.ItemBuilder;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

import javax.annotation.Nonnull;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum Addon implements Attachment {

    SMALL_ROOF_BOX("Kleine Dachbox",
            "f7aadff9ddc546fdcec6ed5919cc39dfa8d0c07ff4bc613a19f2e6d7f2593"),
    BIG_ROOF_BOX("Große Dachbox",
            "69cb3d19db529a215cf62697591cc13fb8c786a8f27b7528c32ac2986b9670c4"),
    LEFT_BIKE_SLOT("Linke Fahrradbefestigung",
            "12a00cd216132735516671116eba3aa150c206b61acdd3dfa54c03bd7e45cc63"),
    RIGHT_BIKE_SLOT("Rechte Fahrradbefestigung",
            "12a00cd216132735516671116eba3aa150c206b61acdd3dfa54c03bd7e45cc63");

    @Getter
    @Nonnull
    private final String displayName;
    private final String skull;

    @Override
    public @Nonnull ItemBuilder getItem() {
        return Core.createItem(skull).setDisplayName(Component.text(displayName, NamedTextColor.GOLD));
    }
}
