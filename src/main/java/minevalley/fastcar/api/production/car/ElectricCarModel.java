package minevalley.fastcar.api.production.car;

import minevalley.fastcar.api.production.RechargeableModel;
import minevalley.fastcar.api.vehicle.car.CombustionCar;

@SuppressWarnings("unused")
public interface ElectricCarModel extends CarModel<CombustionCar>, RechargeableModel {

}