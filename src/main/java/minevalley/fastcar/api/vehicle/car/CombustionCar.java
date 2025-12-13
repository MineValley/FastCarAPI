package minevalley.fastcar.api.vehicle.car;

import minevalley.fastcar.api.production.car.CombustionCarModel;
import minevalley.fastcar.api.vehicle.RefuelableVehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface CombustionCar extends Car<CombustionCar>, RefuelableVehicle {

    @Nonnull
    @Contract(pure = true)
    @Override
    CombustionCarModel model();
}