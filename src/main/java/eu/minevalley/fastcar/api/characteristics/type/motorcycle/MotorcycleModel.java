package eu.minevalley.fastcar.api.characteristics.type.motorcycle;

import eu.minevalley.fastcar.api.characteristics.Model;
import eu.minevalley.fastcar.api.characteristics.specs.RefuelableModel;
import eu.minevalley.fastcar.api.characteristics.specs.StorageModel;
import eu.minevalley.fastcar.api.vehicle.motorcycle.Motorcycle;

@SuppressWarnings("unused")
public interface MotorcycleModel extends Model<Motorcycle>, RefuelableModel, StorageModel {


}