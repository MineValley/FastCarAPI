package minevalley.fastcar.api.vehicle.scooter;

import minevalley.fastcar.api.production.scooter.CombustionScooterModel;
import minevalley.fastcar.api.vehicle.RefuelableVehicle;
import minevalley.fastcar.api.vehicle.StorageVehicle;
import minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface CombustionScooter extends Vehicle<CombustionScooter>, RefuelableVehicle, StorageVehicle {

    @Nonnull
    @Override
    @Contract(pure = true)
    CombustionScooterModel model();
}