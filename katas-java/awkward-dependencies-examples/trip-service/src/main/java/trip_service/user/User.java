package trip_service.user;

import trip_service.trip.Trip;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class User {

    private final String name;
    private final List<Trip> trips = new ArrayList<>();
    private final List<User> friends = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

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

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("trips=" + trips)
                .add("friends=" + friends)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(trips, user.trips) && Objects.equals(friends, user.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, trips, friends);
    }
}