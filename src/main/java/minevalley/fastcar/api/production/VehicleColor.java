package minevalley.fastcar.api.production;

import javax.annotation.Nonnull;
import java.awt.*;

/**
 * Vehicle models can come in different colors. Users can select a color when purchasing a vehicle or change it later.
 *
 * @param name  name of the color
 * @param color the actual color
 */
@SuppressWarnings("unused")
public record VehicleColor(@Nonnull String name, @Nonnull Color color) {
}