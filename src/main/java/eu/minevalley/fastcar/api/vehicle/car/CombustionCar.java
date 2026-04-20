package eu.minevalley.fastcar.api.vehicle.car;

import eu.minevalley.fastcar.api.characteristics.type.car.CombustionCarModel;
import eu.minevalley.fastcar.api.vehicle.RefuelableVehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface CombustionCar extends Car<CombustionCar>, RefuelableVehicle {

    @Nonnull
    @Contract(pure = true)
    @Override
    CombustionCarModel model();
}