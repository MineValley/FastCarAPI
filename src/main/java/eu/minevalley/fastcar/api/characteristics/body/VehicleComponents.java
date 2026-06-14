package eu.minevalley.fastcar.api.characteristics.body;

import eu.minevalley.core.api.item.ItemBuilder;
import eu.minevalley.fastcar.api.FastCar;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.kyori.adventure.text.format.NamedTextColor;

import javax.annotation.Nonnull;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum VehicleComponents implements Attachment {

    TRAILER_HITCH("Anhängerkupplung",
            "c411d48eebe3b1a327ad5fefe48b9852f8a449930c9b2fedaeef2d5f7ad20a6e"),
    AIR_SCREW("Propeller",
            "1b52027c71f6ec38426cc2bb75d8e67b91dc82869ffdcb70efdf513d6325f62e"),
    SMALL_STORAGE("Staufach", "2060ff2fe936cd9a7f42d1d7032681c608a614d2e40d4d194dee99545904e"),
    BIG_STORAGE("Kofferraum", "69cb3d19db529a215cf62697591cc13fb8c786a8f27b7528c32ac2986b9670c4"),
    LICENSE_PLATE_FRONT("Kennzeichen vorne", "c3773e052d391e869e0afab2a3455f480354e48ac46528b14387bc62849b060d"),
    LICENSE_PLATE_BACK("Kennzeichen hinten", "d4807931913864a18f0731aac3cf065e929535deee8105299bb8c5519ff0e66e");

    @Getter
    @Nonnull
    private final String displayName;
    private final String skull;

    @Override
    public @Nonnull ItemBuilder getItem() {
        return FastCar.core().createItem(skull).setDisplayName(displayName, NamedTextColor.GOLD);
    }
}
