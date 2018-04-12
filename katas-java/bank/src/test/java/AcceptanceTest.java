import org.junit.Ignore;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AcceptanceTest {
    @Test
    @Ignore
    public void should_print_statement_containing_all_transactions() throws ParseException {
        Console console = mock(Console.class);
        Calendar calendar = mock(Calendar.class);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        when(calendar.currentDate()).thenReturn(
		format.parse("01/04/2014"),
		format.parse("02/04/2014"),
		format.parse("10/04/2014"));
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
