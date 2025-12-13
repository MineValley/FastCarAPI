package minevalley.fastcar.api.production.car;

import minevalley.fastcar.api.production.RechargeableModel;
import minevalley.fastcar.api.vehicle.car.CombustionCar;
import minevalley.fastcar.api.vehicle.car.ElectricCar;

@SuppressWarnings("unused")
public interface ElectricCarModel extends CarModel<ElectricCar>, RechargeableModel {

}