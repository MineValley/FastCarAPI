package eu.minevalley.fastcar.api.vehicle.bicycle;

import eu.minevalley.fastcar.api.characteristics.type.bicycle.BicycleModel;
import eu.minevalley.fastcar.api.vehicle.Vehicle;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Bicycle extends Vehicle<Bicycle> {

    @Override
    @Nonnull
    @Contract(pure = true)
    BicycleModel model();
}
