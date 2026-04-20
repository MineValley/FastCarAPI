package eu.minevalley.fastcar.api.vehicle.motorcycle;

import eu.minevalley.fastcar.api.characteristics.type.motorcycle.MotorcycleModel;
import eu.minevalley.fastcar.api.vehicle.RefuelableVehicle;
import eu.minevalley.fastcar.api.vehicle.StorageVehicle;
import eu.minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Motorcycle extends Vehicle<Motorcycle>, RefuelableVehicle, StorageVehicle {

    @Nonnull
    @Override
    @Contract(pure = true)
    MotorcycleModel model();
}