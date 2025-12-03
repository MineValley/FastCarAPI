package minevalley.fastcar.api.parking;

import minevalley.core.api.localization.Address;
import minevalley.core.api.users.User;
import minevalley.fastcar.api.vehicle.car.Car;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;
import java.util.Set;

/**
 * Represents a garage where vehicles can be parked.
 */
@SuppressWarnings("unused")
public interface Garage extends Address {

    /**
     * The name of the garage.
     *
     * @return the garage name
     */
    @Nonnull
    @Contract(pure = true)
    String name();

    /**
     * The set of parking tickets associated with this garage.
     *
     * @return a set of parking tickets
     */
    @Nonnull
    @Contract(pure = true)
    Set<ParkingTicket> getParkingTickets();

    /**
     * The set of cars parked in this garage.
     *
     * @return a set of cars
     */
    @Nonnull
    @Contract(pure = true)
    Set<Car<?>> getCars();

    /**
     * Issues a parking ticket for the specified car, issued by the specified user.
     *
     * @param car      car to issue the ticket for
     * @param issuedBy user issuing the ticket
     * @return the issued parking ticket
     * @throws IllegalArgumentException if car or issuedBy is null
     */
    @Nonnull
    @Contract("_, _ -> new")
    ParkingTicket issueParkingTicket(@Nonnull Car<?> car, @Nonnull User issuedBy) throws IllegalArgumentException;
}
