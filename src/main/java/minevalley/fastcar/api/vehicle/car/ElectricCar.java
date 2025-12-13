package minevalley.fastcar.api.vehicle.car;

import minevalley.fastcar.api.production.car.ElectricCarModel;
import minevalley.fastcar.api.vehicle.RechargeableVehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface ElectricCar extends Car<ElectricCar>, RechargeableVehicle {

    @Nonnull
    @Override
    @Contract(pure = true)
    ElectricCarModel model();
}
