package minevalley.fastcar.api.production.shape;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import minevalley.core.api.Core;
import minevalley.core.api.utils.ItemBuilder;
import net.kyori.adventure.text.format.NamedTextColor;

import javax.annotation.Nonnull;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum VehicleComponent implements Attachment {

    TRUNK("Kofferraum",
            "5f23f115cb9520dd4d4cb29124dabac5e6844f96cce241a3ec9ca6f7a296247"),
    AIR_SCREW("Propeller",
            "1b52027c71f6ec38426cc2bb75d8e67b91dc82869ffdcb70efdf513d6325f62e");

    @Getter
    @Nonnull
    private final String displayName;
    private final String skull;

    @Override
    public @Nonnull ItemBuilder getItem() {
        return Core.createItem(skull).setDisplayName(displayName, NamedTextColor.GOLD);
    }
}
