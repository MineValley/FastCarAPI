package minevalley.fastcar.api.production.aircraft;

import minevalley.fastcar.api.production.Model;
import minevalley.fastcar.api.production.RefuelableModel;
import minevalley.fastcar.api.production.StorageModel;
import minevalley.fastcar.api.vehicle.aircraft.Helicopter;

@SuppressWarnings("unused")
public interface HelicopterModel extends Model<Helicopter>, RefuelableModel, StorageModel {

}