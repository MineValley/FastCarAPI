package minevalley.fastcar.api.vehicle.scooter;

import minevalley.fastcar.api.physics.TwoWheeler;
import minevalley.fastcar.api.vehicle.Licensed;
import minevalley.fastcar.api.vehicle.Refuelable;
import minevalley.fastcar.api.vehicle.Storage;
import minevalley.fastcar.api.vehicle.Vehicle;

@SuppressWarnings("unused")
public interface CombustionScooter extends Vehicle<TwoWheeler>, Refuelable, Storage, Licensed {


}