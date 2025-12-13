package minevalley.fastcar.api.vehicle.scooter;

import minevalley.fastcar.api.production.scooter.ElectricScooterModel;
import minevalley.fastcar.api.vehicle.RechargeableVehicle;
import minevalley.fastcar.api.vehicle.StorageVehicle;
import minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface ElectricScooter extends Vehicle<ElectricScooter>, RechargeableVehicle, StorageVehicle {

    @Nonnull
    @Override
    @Contract(pure = true)
    ElectricScooterModel model();
}