package minevalley.fastcar.api.characteristics.type.scooter;

import minevalley.fastcar.api.characteristics.Model;
import minevalley.fastcar.api.characteristics.specs.RefuelableModel;
import minevalley.fastcar.api.characteristics.specs.StorageModel;
import minevalley.fastcar.api.vehicle.scooter.CombustionScooter;

@SuppressWarnings("unused")
public interface CombustionScooterModel extends Model<CombustionScooter>, StorageModel, RefuelableModel {
}
