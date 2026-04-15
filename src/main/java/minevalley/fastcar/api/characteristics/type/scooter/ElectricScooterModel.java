package minevalley.fastcar.api.characteristics.type.scooter;

import minevalley.fastcar.api.characteristics.Model;
import minevalley.fastcar.api.characteristics.specs.RechargeableModel;
import minevalley.fastcar.api.characteristics.specs.StorageModel;
import minevalley.fastcar.api.vehicle.scooter.ElectricScooter;

@SuppressWarnings("unused")
public interface ElectricScooterModel extends Model<ElectricScooter>, StorageModel, RechargeableModel {
}
