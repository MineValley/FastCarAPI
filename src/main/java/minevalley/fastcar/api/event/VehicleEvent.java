package minevalley.fastcar.api.event;

import lombok.Getter;
import minevalley.fastcar.api.physics.PhysicsObject;
import minevalley.fastcar.api.vehicle.Vehicle;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

@Getter
@SuppressWarnings("unused")
public abstract class VehicleEvent extends Event {

    private static final HandlerList handlerList = new HandlerList();

    @Nonnull
    private final Vehicle<? extends PhysicsObject> vehicle;

    protected VehicleEvent(@Nonnull Vehicle<? extends PhysicsObject> vehicle) {
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