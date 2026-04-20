package eu.minevalley.fastcar.api.vehicle.scooter;

import eu.minevalley.fastcar.api.characteristics.type.scooter.ElectricScooterModel;
import eu.minevalley.fastcar.api.vehicle.RechargeableVehicle;
import eu.minevalley.fastcar.api.vehicle.StorageVehicle;
import eu.minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface ElectricScooter extends Vehicle<ElectricScooter>, RechargeableVehicle, StorageVehicle {

    @Nonnull
    @Override
    @Contract(pure = true)
    ElectricScooterModel model();
}