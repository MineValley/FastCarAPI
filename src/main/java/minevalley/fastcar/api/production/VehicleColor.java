package minevalley.fastcar.api.production;

import javax.annotation.Nonnull;
import java.awt.*;

@SuppressWarnings("unused")
public record VehicleColor(@Nonnull String name, @Nonnull Color color) {
}