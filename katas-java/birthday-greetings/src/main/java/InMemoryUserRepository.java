import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class InMemoryUserRepository {
    public List<User> all() {
        return Arrays.asList(
                new User("Silvia", "Redonda", LocalDate.of(2000, 10, 1)),
                new User("Alberto", "Cuadrado", LocalDate.of(1001, 8, 3)),
                new User("Flor", "Triángulo", LocalDate.of(2000, 10, 1)),
                new User("Roberto", "Hexágono", LocalDate.of(2000, 10, 1))
        );
    }
}
