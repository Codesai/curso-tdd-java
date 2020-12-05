import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.LocalDate;

public class AcceptanceTest {

  @Test
  @Disabled
  public void should_print_statement_containing_all_transactions() throws ParseException {
    Console console = mock(Console.class);
    Calendar calendar = mock(Calendar.class);
    when(calendar.currentDate()).thenReturn(
        LocalDate.of(2014, 4, 1),
        LocalDate.of(2014, 4, 2),
        LocalDate.of(2014, 4, 10)
    );
    AccountService account = new AccountService(console, calendar);

    account.deposit(1000);
    account.withdraw(100);
    account.deposit(500);
    account.printStatement();

    verify(console).printLine("DATE | AMOUNT | BALANCE");
    verify(console).printLine("10/04/2014 | 500 | 1400");
    verify(console).printLine("02/04/2014 | -100 | 900");
    verify(console).printLine("01/04/2014 | 1000 | 1000");
  }
}
