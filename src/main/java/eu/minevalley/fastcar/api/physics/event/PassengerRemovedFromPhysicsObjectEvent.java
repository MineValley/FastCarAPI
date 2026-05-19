package eu.minevalley.fastcar.api.physics.event;

import eu.minevalley.core.api.virtual.riding.Passenger;
import eu.minevalley.fastcar.api.physics.PhysicsObject;
import eu.minevalley.fastcar.api.vehicle.Vehicle;
import lombok.Getter;

import javax.annotation.Nonnull;

/**
 * This event is triggered whenever a passenger is removed from a physics object
 */
@SuppressWarnings("unused")
@Getter
public class PassengerRemovedFromPhysicsObjectEvent<T extends Vehicle<T>> extends PhysicsObjectEvent<T> {

    @Nonnull
    private final Passenger passenger;

    public PassengerRemovedFromPhysicsObjectEvent(@Nonnull PhysicsObject<T> physicsObject, @Nonnull Passenger passenger) {
        super(physicsObject);
        this.passenger = passenger;
    }
}