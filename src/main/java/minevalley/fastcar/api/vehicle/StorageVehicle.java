package minevalley.fastcar.api.vehicle;

import minevalley.core.api.user.OnlineUser;
import minevalley.fastcar.api.production.StorageModel;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import java.util.Set;

/**
 * Represents a vehicle that has storage capabilities (e.g. cars, helicopters, ...)
 */
@SuppressWarnings("unused")
public interface StorageVehicle {

    /**
     * Returns the {@link StorageModel} of this vehicle.
     *
     * @return the non-null storage model of this vehicle
     */
    @Nonnull
    @Contract(pure = true)
    StorageModel model();

    /**
     * Returns a set of all itemstacks in this storage.
     *
     * @return set of all itemstacks in this storage
     */
    @Nonnull
    @Contract(pure = true)
    Set<ItemStack> getStorageContents();

    /**
     * Returns the amount of used storage slots in this vehicle's storage.
     *
     * @return the amount of used storage slots
     */
    @Nonnegative
    @Contract(pure = true)
    int getAmountOfUsedStorageSlots();

    /**
     * Returns the amount of free storage slots in this vehicle's storage.
     *
     * @return the amount of free storage slots
     */
    @Nonnegative
    @Contract(pure = true)
    default int getAmountOfFreeStorageSlots() {
        return model().amountOfTotalStorageSlots() - getAmountOfUsedStorageSlots();
    }

    /**
     * Opens the storage of this vehicle for the given user.
     *
     * @param user     the non-null user for whom to open the storage
     * @param readOnly whether the storage should be opened in read-only mode
     * @throws IllegalArgumentException if the user is null
     */
    void openStorage(@Nonnull OnlineUser user, boolean readOnly) throws IllegalArgumentException;
}
