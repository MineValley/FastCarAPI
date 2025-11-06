package minevalley.fastcar.api.event;

import minevalley.fastcar.api.vehicle.Vehicle;

import javax.annotation.Nonnull;

/**
 * This event is triggered whenever a vehicle is spawned into the world.
 */
@SuppressWarnings("unused")
public class VehicleSpawnEvent<T extends Vehicle<T>> extends VehicleEvent<T> {


    public VehicleSpawnEvent(@Nonnull T vehicle) {
        super(vehicle);
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