## Goal
Develop a program to manage the transactions of a bank account.

The transactions are: deposit money into the account, and withdraw from the account. 

We need to be able to print into the console the result.
## Requirement
You cannot change the signature of the public interface (the class AccountService).
## Code
	public class AccountService {
		public void deposit(int amount) {
		}

		public void withdraw(int amount) {
		}

		public void printStatement() {
		}
	}
##Acceptance test

	@Test
	public void should_print_statement_containing_all_transactions() {
		account.deposit(1000);
		account.withdraw(100);
		account.deposit(500);

		account.printStatement();

		verify(console).printLine("DATE | AMOUNT | BALANCE");
		verify(console).printLine("10/04/2014 | 500 | 1400");
		verify(console).printLine("02/04/2014 | -100 | 900");
		verify(console).printLine("01/04/2014 | 1000 | 1000");
	}
## Tip
Start writing the acceptance test but then move to unit tests, and at the end focus again on Acceptance test.

## Documentation
[Mockito](http://mockito.org)

[How to use Mockito](http://site.mockito.org/#now-you-can-verify-interactions)
