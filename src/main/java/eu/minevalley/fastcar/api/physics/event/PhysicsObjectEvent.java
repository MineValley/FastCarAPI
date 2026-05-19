package eu.minevalley.fastcar.api.physics.event;

import eu.minevalley.fastcar.api.physics.PhysicsObject;
import eu.minevalley.fastcar.api.vehicle.Vehicle;
import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

@Getter
@SuppressWarnings("unused")
public abstract class PhysicsObjectEvent<T extends Vehicle<T>> extends Event {

    private static final HandlerList handlerList = new HandlerList();

    @Nonnull
    private final PhysicsObject<T> physicsObject;

    protected PhysicsObjectEvent(@Nonnull PhysicsObject<T> physicsObject) {
        this.physicsObject = physicsObject;
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