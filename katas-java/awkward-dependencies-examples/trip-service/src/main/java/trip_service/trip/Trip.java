package trip_service.trip;

import java.util.Objects;
import java.util.StringJoiner;

public class Trip {
    private final String id;

    public Trip(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Trip.class.getSimpleName() + "[", "]")
                .add("tripId='" + id + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trip)) return false;
        Trip trip = (Trip) o;
        return Objects.equals(id, trip.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
