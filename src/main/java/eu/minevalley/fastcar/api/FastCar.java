package eu.minevalley.fastcar.api;

import eu.minevalley.core.api.Core;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public final class FastCar {

    private static FastCarProvider provider;
    private static Core core;

    @Nonnull
    @Contract(pure = true)
    public static Core core() {
        return core;
    }
}