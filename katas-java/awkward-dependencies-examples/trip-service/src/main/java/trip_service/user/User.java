package trip_service.user;

import trip_service.trip.Trip;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final List<Trip> trips = new ArrayList<>();
    private final List<User> friends = new ArrayList<>();

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User user) {
        friends.add(user);
    }

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public List<Trip> trips() {
        return trips;
    }

}