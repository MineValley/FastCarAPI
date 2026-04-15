package minevalley.fastcar.api.characteristics.type.aircraft;

import minevalley.fastcar.api.characteristics.Model;
import minevalley.fastcar.api.characteristics.specs.RefuelableModel;
import minevalley.fastcar.api.characteristics.specs.StorageModel;
import minevalley.fastcar.api.vehicle.aircraft.Helicopter;

@SuppressWarnings("unused")
public interface HelicopterModel extends Model<Helicopter>, RefuelableModel, StorageModel {

}