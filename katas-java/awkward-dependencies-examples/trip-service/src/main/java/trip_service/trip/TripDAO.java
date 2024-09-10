package trip_service.trip;

import trip_service.exceptions.AwkwardDependencyException;
import trip_service.user.User;

import java.util.List;

public class TripDAO {

    public static List<Trip> findTripsByUser(User user) {
        // It gets a User from a DB.
        // This shouldn't be executed in a unit test.
        // We throw an exception instead to avoid complicating the example with the real implementation code.
        throw new AwkwardDependencyException("TripDAO should not be invoked on an unit test.");
    }

}
