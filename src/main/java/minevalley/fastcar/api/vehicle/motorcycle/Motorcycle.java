package minevalley.fastcar.api.vehicle.motorcycle;

import minevalley.fastcar.api.production.motorcycle.MotorcycleModel;
import minevalley.fastcar.api.vehicle.RefuelableVehicle;
import minevalley.fastcar.api.vehicle.StorageVehicle;
import minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Motorcycle extends Vehicle<Motorcycle>, RefuelableVehicle, StorageVehicle {

    @Nonnull
    @Override
    @Contract(pure = true)
    MotorcycleModel model();
}