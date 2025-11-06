package minevalley.fastcar.api.vehicle.car;

import minevalley.fastcar.api.vehicle.Licensed;
import minevalley.fastcar.api.vehicle.Refuelable;
import minevalley.fastcar.api.vehicle.Storage;
import minevalley.fastcar.api.vehicle.Vehicle;

@SuppressWarnings("unused")
public interface Car extends Vehicle<Car>, Refuelable, Storage, Licensed {

    void test();
}
