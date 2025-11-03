package minevalley.fastcar.api.vehicle;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

/**
 * Represents a vehicle that has storage capabilities (e.g. cars, helicopters, ...)
 */
@SuppressWarnings("unused")
public interface Storage {

    /**
     * Gets the contents of the vehicle's storage.
     *
     * @return an array of ItemStacks representing the contents of the storage
     */
    @Nonnull
    @Contract(pure = true)
    ItemStack[] getStorageContents();
}
