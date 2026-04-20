package eu.minevalley.fastcar.api.characteristics.type.car;

import eu.minevalley.fastcar.api.characteristics.Model;
import eu.minevalley.fastcar.api.characteristics.specs.StorageModel;
import eu.minevalley.fastcar.api.vehicle.car.Car;

public interface CarModel<T extends Car<T>> extends Model<T>, StorageModel {

}