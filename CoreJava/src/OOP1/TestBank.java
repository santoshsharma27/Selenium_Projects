package OOP1;

public class TestBank {

	public static void main(String[] args) {
		ICICIBank ic = new ICICIBank();
		ic.carLoan();
		ic.educationLoan();
		ic.homeLoan();
		
		ic.credit();
		ic.debit();
		ic.transferMoney();
		ic.trading();
		
		ic.mutualFunds();
		ic.insurance();
		
		System.out.println(USBank.min_bal);
		
		USBank us = new ICICIBank();
		us.credit();
		us.debit();
		us.transferMoney();
		us.trading();

	}

}
