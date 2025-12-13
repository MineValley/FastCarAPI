package minevalley.fastcar.api.production.car;

import minevalley.fastcar.api.production.Model;
import minevalley.fastcar.api.production.StorageModel;
import minevalley.fastcar.api.vehicle.car.Car;

public interface CarModel<T extends Car<T>> extends Model<T>, StorageModel {


}