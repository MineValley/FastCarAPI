package minevalley.fastcar.api.production;

@SuppressWarnings("unused")
public interface RechargeableModel extends PoweredModel {

    /**
     * Gets the charge capacity of the model in kilo-watt-hours (kWh).
     *
     * @return the charge capacity in kWh
     */
    int getChargeCapacity();
}
