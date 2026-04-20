package eu.minevalley.fastcar.api.vehicle.bicycle;

import eu.minevalley.fastcar.api.characteristics.type.bicycle.PedelecModel;
import eu.minevalley.fastcar.api.vehicle.RechargeableVehicle;
import eu.minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Pedelec extends Vehicle<Pedelec>, RechargeableVehicle {

    @Override
    @Nonnull
    @Contract(pure = true)
    PedelecModel model();
}
