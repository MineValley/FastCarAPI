package eu.minevalley.fastcar.api.characteristics;

import javax.annotation.Nonnull;
import java.awt.*;

/**
 * Vehicle models can come in different colors. Users can select a color when purchasing a vehicle or change it later.
 *
 * @param name  name of the color
 * @param color the actual color
 */
@SuppressWarnings("unused")
public record VehicleColor(int id, @Nonnull String name, @Nonnull Color color) {

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
    public boolean equals(Object obj) {
        return obj instanceof VehicleColor && this.id() == ((VehicleColor) obj).id();
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