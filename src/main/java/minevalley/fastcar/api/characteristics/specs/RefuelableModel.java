package minevalley.fastcar.api.characteristics.specs;

@SuppressWarnings("unused")
public interface RefuelableModel extends PoweredModel {

    /**
     * Gets the fuel capacity of the model in liters.
     *
     * @return the fuel capacity in liters
     */
    int getFuelCapacity();
}
