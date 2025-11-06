package minevalley.fastcar.api.event;

import lombok.Getter;
import minevalley.fastcar.api.physics.PhysicsObject;
import minevalley.fastcar.api.vehicle.Vehicle;

import javax.annotation.Nonnull;

/**
 * This event is triggered whenever a vehicle vanishes from the world.
 * This can happen for various reasons, such as towing or scraping.
 * <p>
 * <b>Note:</b> This event is not called when a vehicle is teleported or the physical representation is vanished by other means (e.g. server shutdown).
 * It is specifically for cases where the {@link PhysicsObject} is removed from the database.
 */
@Getter
@SuppressWarnings("unused")
public class VehicleVanishEvent<T extends Vehicle<T>> extends VehicleEvent<T> {

    @Nonnull
    private final Reason reason;

    public VehicleVanishEvent(@Nonnull T vehicle, @Nonnull Reason reason) {
        super(vehicle);
        this.reason = reason;
    }

    public enum Reason {

        /**
         * When vehicles are towed, they are removed from the world but can be respawned later. The underlying vehicle object stays untouched.
         */
        TOWED,

        /**
         * When vehicles are scraped, they are permanently removed from the world and the underlying vehicle object is deleted.
         */
        SCRAPED
    }
}