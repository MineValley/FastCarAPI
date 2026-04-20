package eu.minevalley.fastcar.api.characteristics.type.scooter;

import eu.minevalley.fastcar.api.characteristics.Model;
import eu.minevalley.fastcar.api.characteristics.specs.RechargeableModel;
import eu.minevalley.fastcar.api.characteristics.specs.StorageModel;
import eu.minevalley.fastcar.api.vehicle.scooter.ElectricScooter;

@SuppressWarnings("unused")
public interface ElectricScooterModel extends Model<ElectricScooter>, StorageModel, RechargeableModel {
}
