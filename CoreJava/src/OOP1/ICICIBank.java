package OOP1;

public class ICICIBank implements USBank, RBI {

	// RBI interface
	@Override
	public void educationLoan() {
		System.out.println("icici--edu Loan");

	}

	@Override
	public void homeLoan() {
		System.out.println("icici--home Loan");

	}

	@Override
	public void carLoan() {
		System.out.println("icici--car Loan");

	}

	@Override
	public void credit() {
		System.out.println("icici credit");

	}

	// USBank Interface
	@Override
	public void debit() {
		System.out.println("icici debit");

	}

	@Override
	public void transferMoney() {
		System.out.println("icici tr money");

	}

	@Override
	public void trading() {
		System.out.println("icici trading");

	}

	// ICICI bank class methods

	public void mutualFunds() {
		System.out.println("icici--mutual funds");
	}

	public void insurance() {
		System.out.println("icici-- insurance");
	}

}
