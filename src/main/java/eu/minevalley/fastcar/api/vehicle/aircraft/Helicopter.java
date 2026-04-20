package eu.minevalley.fastcar.api.vehicle.aircraft;

import eu.minevalley.fastcar.api.characteristics.type.aircraft.HelicopterModel;
import eu.minevalley.fastcar.api.vehicle.RefuelableVehicle;
import eu.minevalley.fastcar.api.vehicle.StorageVehicle;
import eu.minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Helicopter extends Vehicle<Helicopter>, RefuelableVehicle, StorageVehicle {

    @Nonnull
    @Override
    @Contract(pure = true)
    HelicopterModel model();
}
