package minevalley.fastcar.api.vehicle;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

/**
 * Represents a vehicle that has storage capabilities (e.g. cars, helicopters, ...)
 */
@SuppressWarnings("unused")
public interface Storage {

    /**
     * Returns the contents of the vehicle's storage as an array of {@link ItemStack}.
     *
     * @return a non-null array containing the current entries of the storage (may contain {@code null} for empty slots)
     */
    @Nonnull
    @Contract(pure = true)
    ItemStack[] getStorageContents();

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
    default int amountOfTotalStorageLines() {
        return amountOfTotalStorageSlots() / 9;
    }

    /**
     * Returns the amount of used storage slots in this vehicle's storage.
     *
     * @return the amount of used storage slots
     */
    @Nonnegative
    @Contract(pure = true)
    int amountOfUsedStorageSlots();

    /**
     * Returns the amount of free storage slots in this vehicle's storage.
     *
     * @return the amount of free storage slots
     */
    @Nonnegative
    @Contract(pure = true)
    default int amountOfFreeStorageSlots() {
        return amountOfTotalStorageSlots() - amountOfUsedStorageSlots();
    }
}
