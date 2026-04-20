package eu.minevalley.fastcar.api.characteristics.type.aircraft;

import eu.minevalley.fastcar.api.characteristics.Model;
import eu.minevalley.fastcar.api.characteristics.specs.RefuelableModel;
import eu.minevalley.fastcar.api.characteristics.specs.StorageModel;
import eu.minevalley.fastcar.api.vehicle.aircraft.Helicopter;

@SuppressWarnings("unused")
public interface HelicopterModel extends Model<Helicopter>, RefuelableModel, StorageModel {

}