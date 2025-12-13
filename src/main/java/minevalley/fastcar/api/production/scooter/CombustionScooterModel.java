package minevalley.fastcar.api.production.scooter;

import minevalley.fastcar.api.production.Model;
import minevalley.fastcar.api.production.RefuelableModel;
import minevalley.fastcar.api.production.StorageModel;
import minevalley.fastcar.api.vehicle.scooter.CombustionScooter;

@SuppressWarnings("unused")
public interface CombustionScooterModel extends Model<CombustionScooter>, StorageModel, RefuelableModel {
}
