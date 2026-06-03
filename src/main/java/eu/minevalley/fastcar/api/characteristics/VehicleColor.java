package eu.minevalley.fastcar.api.characteristics;

import org.bukkit.Color;

import javax.annotation.Nonnull;

/**
 * Vehicle models can come in different colors. Users can select a color when purchasing a vehicle or change it later.
 *
 * @param name      name of the color
 * @param color     the actual color
 * @param isDefault determines, whether this color is a default color
 */
@SuppressWarnings("unused")
public record VehicleColor(int id, @Nonnull String name, @Nonnull Color color, boolean isDefault) {

    public VehicleColor {
        if (name == null) {
            throw new IllegalArgumentException("VehicleColor name cannot be null");
        }
        if (name.isBlank()) {
            throw new IllegalArgumentException("VehicleColor name cannot be blank");
        }
        if (color == null) {
            throw new IllegalArgumentException("VehicleColor color cannot be null");
        }
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public @Nonnull String toString() {
        return name;
    }
}