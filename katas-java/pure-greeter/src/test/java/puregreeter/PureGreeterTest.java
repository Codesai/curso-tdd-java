package puregreeter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PureGreeterTest {

    private PureGreeter pureGreeter;

    @BeforeEach
    void setUp() {
        pureGreeter = new PureGreeter();
    }

    @Test
    void greet_during_the_morning() {
        String greeting = pureGreeter.greeter(8, "Pepe");

        assertThat(greeting).isEqualTo("¡Buenos días Pepe!");
    }

    @Test
    void greet_during_the_afternoon() {
        String greeting = pureGreeter.greeter(15, "Pepe");

        assertThat(greeting).isEqualTo("¡Buenas tardes Pepe!");
    }

    @Test
    void greet_during_the_night() {
        String greeting = pureGreeter.greeter(22, "Pepe");

        assertThat(greeting).isEqualTo("¡Buenas noches Pepe!");
    }

    @Test
    void greeting_hours_should_be_between_0_and_23() {
        assertThatThrownBy(
                () -> pureGreeter.greeter(40, "Pepe")
        ).isInstanceOf(IllegalArgumentException.class);
    }
}