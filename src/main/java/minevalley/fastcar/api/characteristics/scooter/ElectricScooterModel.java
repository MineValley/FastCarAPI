package minevalley.fastcar.api.characteristics.scooter;

import minevalley.fastcar.api.characteristics.Model;
import minevalley.fastcar.api.characteristics.RechargeableModel;
import minevalley.fastcar.api.characteristics.StorageModel;
import minevalley.fastcar.api.vehicle.scooter.ElectricScooter;

@SuppressWarnings("unused")
public interface ElectricScooterModel extends Model<ElectricScooter>, StorageModel, RechargeableModel {
}
