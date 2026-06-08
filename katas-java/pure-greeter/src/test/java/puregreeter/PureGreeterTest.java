package puregreeter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PureGreeterTest {

  private PureGreeter pureGreeter;

  @BeforeEach
  void setUp() {
    pureGreeter = new PureGreeter();
  }

  @Test
  void greet_during_the_morning() {
    String greeting = pureGreeter.greeter(8, "Pepe");

    assertEquals("¡Buenos días Pepe!", greeting);
  }

  @Test
  void greet_during_the_afternoon() {
    String greeting = pureGreeter.greeter(15, "Pepe");

    assertEquals("¡Buenas tardes Pepe!", greeting);
  }

  @Test
  void greet_during_the_night() {
    String greeting = pureGreeter.greeter(22, "Pepe");

    assertEquals("¡Buenas noches Pepe!", greeting);
  }

  @Test
  void greeting_hours_should_be_between_0_and_23() {
    assertThrows(
            IllegalArgumentException.class,
            () -> pureGreeter.greeter(40, "Pepe")
    );
  }
}