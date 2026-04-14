package minevalley.fastcar.api.characteristics.car;

import minevalley.fastcar.api.characteristics.Model;
import minevalley.fastcar.api.characteristics.StorageModel;
import minevalley.fastcar.api.vehicle.car.Car;

public interface CarModel<T extends Car<T>> extends Model<T>, StorageModel {

}