package eu.minevalley.fastcar.api.physics;

import eu.minevalley.core.api.virtual.riding.Passenger;
import eu.minevalley.fastcar.api.characteristics.body.Seat;
import eu.minevalley.fastcar.api.vehicle.Vehicle;
import eu.minevalley.fastcar.api.visual.Visual;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;

@SuppressWarnings("unused")
public interface PhysicsObject<T extends Vehicle<T>> {

    /**
     * Get the vehicle associated with this physics object.
     *
     * @return the vehicle
     */
    @Nonnull
    @Contract(pure = true)
    T vehicle();

    @Nonnull
    @Contract(pure = true)
    Visual visual();

    /**
     * Get the driver of the vehicle, if any.
     *
     * @return the driver, or null if there is no driver
     */
    @Nullable
    @Contract(pure = true)
    Passenger getDriver();

    /**
     * Get a map of all occupied seats and their corresponding occupants.
     * <p>
     * <b>Note:</b> This map only includes seats that are currently occupied, including the driver seat if occupied.
     *
     * @return a map of occupied seats to their occupants
     */
    @Nonnull
    @Contract(pure = true)
    Map<Seat, Passenger> getPassengers();

    /**
     * Gets the passenger occupying the given seat, or null if the seat is not occupied or if the seat is null.
     *
     * @param seat seat to get the passenger of
     * @return passenger, or null
     */
    @Nullable
    @Contract(value = "null -> null", pure = true)
    default Passenger getPassenger(@Nullable Seat seat) {
        if (seat == null) {
            return null;
        }
        return getPassengers().get(seat);
    }

    /**
     * Adds the given passenger to the given seat.
     *
     * @param seat      seat to add the passenger to
     * @param passenger passenger to add
     * @throws IllegalArgumentException if the seat or the passenger is null
     * @throws IllegalStateException    if the seat is already occupied or if the passenger is already occupying another seat in any vehicle
     */
    void addPassenger(@Nonnull Seat seat, @Nonnull Passenger passenger) throws IllegalArgumentException,
            IllegalStateException;

    /**
     * Adds the given passenger to any free seat.
     *
     * @param passenger passenger to add
     * @throws IllegalStateException if there is no free seat
     * @see #hasFreeSeat()
     */
    void addPassenger(@Nonnull Passenger passenger) throws IllegalStateException;

    /**
     * Kicks all passengers out of this vehicle. Including the driver and every non-player passenger!
     */
    void kickAllPassengers();

    /**
     * Checks whether all seats of this visual are occupied
     *
     * @return true, if all seats are occupied, false if there is at least one free seat
     */
    boolean isOccupied();

    /**
     * Checks whether all seats of this visual are occupied
     *
     * @return true, if all seats are occupied, false if there is at least one free seat
     */
    boolean isFullyOccupied();

    /**
     * Checks whether this visual has one or more free seats
     *
     * @return true, if a seat is empty
     */
    boolean hasFreeSeat();

    /**
     * Get the speed of the object in km/h.
     *
     * @return the speed in km/h
     */
    @Contract(pure = true)
    float getSpeed();
}