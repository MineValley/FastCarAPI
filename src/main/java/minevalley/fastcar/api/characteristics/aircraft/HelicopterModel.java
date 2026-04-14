package minevalley.fastcar.api.characteristics.aircraft;

import minevalley.fastcar.api.characteristics.Model;
import minevalley.fastcar.api.characteristics.RefuelableModel;
import minevalley.fastcar.api.characteristics.StorageModel;
import minevalley.fastcar.api.vehicle.aircraft.Helicopter;

@SuppressWarnings("unused")
public interface HelicopterModel extends Model<Helicopter>, RefuelableModel, StorageModel {

}