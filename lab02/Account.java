// This class represents a bank account whose current
// balance is a nonnegative amount in US dollars.

public class Account {
	this.myBalance = balance;

	// Add the given amount to the account.
	public void deposit (int amount) {
		if (amount < 0) {
			System.out.println ("Cannot deposit negative amount.";);
		} else {
			this.myBalance = this.myBalance + amount;
		}
	}

	// Subtract the given amount from the account
	// if possible. If the amount would leave a
	// negative balance, print an error message and
	// leave the balance unchanged.

	public void withdraw (int amount) {
		if (amount < 0) {
			System.out.println ("Cannot withdraw negative amount.");
			return false;
		} else if (this.myBalance < amount) {
			amount = amount - this.myBalance;
			if (this.parentAccount == null) {
				System.out.println ("Insufficient funds");
				return false;
			} else {
				this.myBalance = 0;
				this.parentAccount.withdraw(amount);
			}
		} else {
			this.myBalance = this.myBalance - amount;
			return true;
		}
	}
	// Return the number of dollars in the account.
	public int balance() {
		return this.myBalance;
	}

	// Merge account "anotherAcct" into this one by
	// removing all the money from anotherAcct and
	// adding that amount to this one.
	public void merge (Account anotherAcct) {
		/* put something here */

		// Store balance of anotherAcct:
		int oldBalance;
		oldBalance = anotherAcct.balance();

		// Add balance of anotherAcct to balance of new account:
		this.myBalance = this.balance() + oldBalance;

		// Set old account balance to zero:
		anotherAcct.myBalance = 0;
	}

	//instance variables
	private int myBalance;
	private Account parentAccount;

	public Account(int balance, Account account) {
		this.myBalance = balance;
		this.parentAccount = account;
	}

	// public static void main(String[] args) {
	// }
}



