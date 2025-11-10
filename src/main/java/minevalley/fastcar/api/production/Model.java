package minevalley.fastcar.api.production;

import minevalley.fastcar.api.production.shape.Addon;
import minevalley.fastcar.api.production.shape.Attachment;
import minevalley.fastcar.api.production.shape.Seat;
import minevalley.fastcar.api.production.shape.VehicleComponent;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;
import java.util.Set;

/**
 * A vehicle model represents a specific design or version of a vehicle produced by a manufacturer.
 * Every vehicle has a model. All vehicles of the same model share its common characteristics and features.
 */
@SuppressWarnings("unused")
public interface Model {

    /**
     * Gets the name of this model.
     *
     * @return The model name.
     */
    @Nonnull
    @Contract(pure = true)
    String name();

    /**
     * Gets the manufacturer of this model.
     *
     * @return The manufacturer.
     */
    @Nonnull
    @Contract(pure = true)
    Manufacturer manufacturer();

    /**
     * Gets the attachments of this model.
     *
     * @return The set of attachments.
     */
    @Nonnull
    @Contract(pure = true)
    Set<Attachment> attachments();

    /**
     * Gets the seats of this model.
     *
     * @return The set of seats.
     */
    @Nonnull
    @Contract(pure = true)
    Set<Seat> seats();

    /**
     * Gets the total amount of seats of this model.
     *
     * @return The amount of seats
     */
    @Contract(pure = true)
    int seatCount();

    /**
     * Gets the addons of this model.
     *
     * @return The set of addons.
     */
    @Nonnull
    @Contract(pure = true)
    Set<Addon> addons();

    /**
     * Gets all components of this model.
     *
     * @return The set of components.
     */
    @Nonnull
    @Contract(pure = true)
    Set<VehicleComponent> components();
}
