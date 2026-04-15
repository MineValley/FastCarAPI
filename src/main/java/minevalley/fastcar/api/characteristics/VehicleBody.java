package minevalley.fastcar.api.characteristics;

import minevalley.fastcar.api.characteristics.body.Addon;
import minevalley.fastcar.api.characteristics.body.Seat;
import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;
import java.util.Set;

@SuppressWarnings("unused")
public interface VehicleBody {

    /**
     * Gets the name of this body.
     *
     * @return The body name.
     */
    @Nonnull
    @Contract(pure = true)
    String name();

    /**
     * Gets the itemModel of this body.
     *
     * @return itemModel
     */
    @Nonnull
    @Contract(pure = true)
    NamespacedKey itemModel();

    /**
     * Gets the seats of this body.
     *
     * @return The set of seats.
     */
    @Nonnull
    @Contract(pure = true)
    Set<Seat> seats();

    /**
     * Gets the total amount of seats of this body.
     *
     * @return The amount of seats
     */
    @Contract(pure = true)
    int seatCount();

    /**
     * Gets the addons of this body.
     *
     * @return The set of addons.
     */
    @Nonnull
    @Contract(pure = true)
    Set<Addon> addons();

    /**
     * Checks if this body has a roof.
     *
     * @return True if it has a roof, false otherwise.
     */
    @Contract(pure = true)
    boolean hasRoof();
}