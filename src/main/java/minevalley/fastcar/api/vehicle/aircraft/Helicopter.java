package minevalley.fastcar.api.vehicle.aircraft;

import minevalley.fastcar.api.physics.Aircraft;
import minevalley.fastcar.api.vehicle.Refuelable;
import minevalley.fastcar.api.vehicle.Licensed;
import minevalley.fastcar.api.vehicle.Storage;
import minevalley.fastcar.api.vehicle.Vehicle;

@SuppressWarnings("unused")
public interface Helicopter extends Vehicle<Aircraft>, Refuelable, Storage, Licensed {
}
