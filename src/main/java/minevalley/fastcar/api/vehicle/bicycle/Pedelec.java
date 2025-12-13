package minevalley.fastcar.api.vehicle.bicycle;

import minevalley.fastcar.api.production.bicycle.PedelecModel;
import minevalley.fastcar.api.vehicle.RechargeableVehicle;
import minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Pedelec extends Vehicle<Pedelec>, RechargeableVehicle {

    @Override
    @Nonnull
    @Contract(pure = true)
    PedelecModel model();
}
