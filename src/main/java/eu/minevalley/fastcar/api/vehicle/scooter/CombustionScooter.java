package eu.minevalley.fastcar.api.vehicle.scooter;

import eu.minevalley.fastcar.api.characteristics.type.scooter.CombustionScooterModel;
import eu.minevalley.fastcar.api.vehicle.RefuelableVehicle;
import eu.minevalley.fastcar.api.vehicle.StorageVehicle;
import eu.minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface CombustionScooter extends Vehicle<CombustionScooter>, RefuelableVehicle, StorageVehicle {

    @Nonnull
    @Override
    @Contract(pure = true)
    CombustionScooterModel model();
}