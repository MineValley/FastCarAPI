package minevalley.fastcar.api.production.scooter;

import minevalley.fastcar.api.production.Model;
import minevalley.fastcar.api.production.RechargeableModel;
import minevalley.fastcar.api.production.StorageModel;
import minevalley.fastcar.api.vehicle.scooter.ElectricScooter;

@SuppressWarnings("unused")
public interface ElectricScooterModel extends Model<ElectricScooter>, StorageModel, RechargeableModel {
}
