package minevalley.fastcar.api.event;

import lombok.Getter;
import lombok.Setter;
import minevalley.fastcar.api.administration.Penalty;
import minevalley.fastcar.api.vehicle.Vehicle;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

/**
 * This event is triggered whenever a penalty is issued to a player.
 * This can happen for various reasons, such as traffic violations or other infractions.
 * Penalties are issued either automatically by the system or manually by the police.
 *
 * @see Penalty
 */
@Getter
@SuppressWarnings("unused")
public class PenaltyIssuedEvent<T extends Vehicle<T>> implements Cancellable {

    private static final HandlerList handlerList = new HandlerList();

    @Setter
    private boolean cancelled = false;

    @Nonnull
    private final Penalty<T> penalty;

    public PenaltyIssuedEvent(@Nonnull Penalty<T> penalty) {
        this.penalty = penalty;
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