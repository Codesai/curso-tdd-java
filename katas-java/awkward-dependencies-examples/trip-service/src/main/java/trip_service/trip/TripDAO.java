package trip_service.trip;

import trip_service.user.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TripDAO {

    private static final String DATABASE_NAME = "trips";
    private static final String USER = "phileas";
    private static final String PASS = "123456";

    public static List<Trip> findTripsByUser(User user) {
        var trips = new ArrayList<Trip>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE_NAME, USER, PASS)) {

            final String sql = "select id from trips where user like ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, user.getName()); 
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    trips.add(new Trip(resultSet.getString(1)));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return trips;
    }
}
