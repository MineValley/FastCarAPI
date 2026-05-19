package eu.minevalley.fastcar.api.vehicle.event;

import eu.minevalley.fastcar.api.vehicle.Vehicle;
import lombok.Getter;

import javax.annotation.Nonnull;

/**
 * This event is triggered whenever a vehicle is spawned into the world.
 */
@Getter
@SuppressWarnings("unused")
public class VehicleSpawnEvent<T extends Vehicle<T>> extends VehicleEvent<T> {

    @Nonnull
    private final Reason reason;

    public VehicleSpawnEvent(@Nonnull T vehicle, @Nonnull Reason reason) {
        super(vehicle);
        this.reason = reason;
    }

    enum Reason {
        /**
         * When a vehicle is spawned normally into the world.
         */
        BIRTH,

        /**
         * When a vehicle is respawned after being towed.
         */
        RESPAWNED_AFTER_TOWING

    }
}