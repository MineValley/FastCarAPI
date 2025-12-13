package minevalley.fastcar.api.vehicle.aircraft;

import minevalley.fastcar.api.production.aircraft.HelicopterModel;
import minevalley.fastcar.api.vehicle.RefuelableVehicle;
import minevalley.fastcar.api.vehicle.StorageVehicle;
import minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Helicopter extends Vehicle<Helicopter>, RefuelableVehicle, StorageVehicle {

    @Nonnull
    @Override
    @Contract(pure = true)
    HelicopterModel model();
}
