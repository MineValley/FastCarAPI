package minevalley.fastcar.api.vehicle;

import minevalley.fastcar.api.production.StorageModel;
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
     * Returns the {@link StorageModel} of this vehicle.
     *
     * @return the non-null storage model of this vehicle
     */
    @Nonnull
    @Contract(pure = true)
    StorageModel getStorageModel();

    /**
     * Returns the contents of the vehicle's storage as an array of {@link ItemStack}.
     *
     * @return a non-null array containing the current entries of the storage (may contain {@code null} for empty slots)
     */
    @Nonnull
    @Contract(pure = true)
    ItemStack[] getStorageContents();

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
        return getStorageModel().amountOfTotalStorageSlots() - amountOfUsedStorageSlots();
    }
}
