package minevalley.fastcar.api.characteristics.body;

import eu.minevalley.proxima.api.Proxima;
import eu.minevalley.proxima.api.item.ItemBuilder;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
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
            "12a00cd216132735516671116eba3aa150c206b61acdd3dfa54c03bd7e45cc63"),
    TRAILER_HITCH("Anhängerkupplung",
            "c411d48eebe3b1a327ad5fefe48b9852f8a449930c9b2fedaeef2d5f7ad20a6e"),
    AIR_SCREW("Propeller",
            "1b52027c71f6ec38426cc2bb75d8e67b91dc82869ffdcb70efdf513d6325f62e");

    @Getter
    @Nonnull
    private final String displayName;
    private final String skull;

    @Override
    public @Nonnull ItemBuilder getItem() {
        return Proxima.createItem(skull).setDisplayName(displayName, NamedTextColor.GOLD);
    }
}
