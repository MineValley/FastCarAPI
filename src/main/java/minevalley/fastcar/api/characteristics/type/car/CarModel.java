package minevalley.fastcar.api.characteristics.type.car;

import minevalley.fastcar.api.characteristics.Model;
import minevalley.fastcar.api.characteristics.specs.StorageModel;
import minevalley.fastcar.api.vehicle.car.Car;

public interface CarModel<T extends Car<T>> extends Model<T>, StorageModel {

}