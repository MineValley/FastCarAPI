package eu.minevalley.fastcar.api.event;

import eu.minevalley.fastcar.api.vehicle.Vehicle;
import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

@Getter
@SuppressWarnings("unused")
public abstract class VehicleEvent<T extends Vehicle<T>> extends Event {

    private static final HandlerList handlerList = new HandlerList();

    @Nonnull
    private final T vehicle;

    protected VehicleEvent(@Nonnull T vehicle) {
        this.vehicle = vehicle;
    }

    @Nonnull
    public HandlerList getHandlers() {
        return handlerList;
    }

    @Nonnull
    public static HandlerList getHandlerList() {
        return handlerList;
    }
}