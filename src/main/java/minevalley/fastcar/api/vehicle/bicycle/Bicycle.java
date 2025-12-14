package minevalley.fastcar.api.vehicle.bicycle;

import minevalley.fastcar.api.production.bicycle.BicycleModel;
import minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Bicycle extends Vehicle<Bicycle> {

    @Override
    @Nonnull
    @Contract(pure = true)
    BicycleModel model();
}
