package minevalley.fastcar.api.production;

import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnegative;

@SuppressWarnings("unused")
public interface StorageModel {

    /**
     * Returns the amount of storage units available in this vehicle's storage.
     * A storage unit consists of multiple (mod 9) storage slots
     *
     * @return the amount of storage units
     */
    @Nonnegative
    @Contract(pure = true)
    int amountOfStorageUnits();

    /**
     * Returns the total amount of storage slots available in this vehicle's storage.
     *
     * @return the total amount of storage slots
     */
    @Nonnegative
    @Contract(pure = true)
    int amountOfTotalStorageSlots();

    /**
     * Returns the total amount of storage lines available in this vehicle's storage.
     * A storage line consists of 9 storage slots.
     *
     * @return the total amount of storage lines
     */
    @Nonnegative
    @Contract(pure = true)
    default int amountOfTotalStorageLines() {
        return amountOfTotalStorageSlots() / 9;
    }
}
