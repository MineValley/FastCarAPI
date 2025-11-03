package minevalley.fastcar.api.design;

import javax.annotation.Nonnull;
import java.awt.*;

@SuppressWarnings("unused")
public record VehicleColor(@Nonnull String name, @Nonnull Color color) {
}