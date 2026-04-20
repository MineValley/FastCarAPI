package eu.minevalley.fastcar.api.characteristics.type.scooter;

import eu.minevalley.fastcar.api.characteristics.Model;
import eu.minevalley.fastcar.api.characteristics.specs.RefuelableModel;
import eu.minevalley.fastcar.api.characteristics.specs.StorageModel;
import eu.minevalley.fastcar.api.vehicle.scooter.CombustionScooter;

@SuppressWarnings("unused")
public interface CombustionScooterModel extends Model<CombustionScooter>, StorageModel, RefuelableModel {
}
