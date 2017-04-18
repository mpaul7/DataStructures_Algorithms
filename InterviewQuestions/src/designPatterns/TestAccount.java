package designPatterns;


interface Account {
	public void deposit (double amount);
	public void withdraw (double amount);
	public double calculateInterest(double amount);
}

class SavingAccount implements Account{
	AccountHelper ah = new AccountHelper();

	@Override
	public void deposit(double amount) {
		System.out.println("Deposit");
		ah.deposit(500.0);
		
	}

	@Override
	public void withdraw(double amount) {
		ah.withdraw(100.0);
		
	}

	@Override
	public double calculateInterest(double amount) {
		// TODO Auto-generated method stub
		return amount/10;
	}
	
	
	
}

class TermDepositAccount implements Account{
	AccountHelper ah = new AccountHelper();
	
	

	@Override
	public void deposit(double amount) {
		System.out.println("Deposit");
		ah.deposit(500.0);
		
	}

	@Override
	public void withdraw(double amount) {
		ah.withdraw(100.0);
		
	}

	@Override
	public double calculateInterest(double amount) {
		// TODO Auto-generated method stub
		return amount/10;
	}
	
}

class AccountHelper {
	
	public void deposit(double amount) {
		System.out.println("Deposit");
	}
	
	public void withdraw(double amount) {
		System.out.println("withdraw");
	}
	
}

class AccountFactory {
	Account account = null;
	
	public Account getAccoutType(String str){
		
		
		if ("saving".equals(str)){
			account  = new SavingAccount();
		} if ("term".equals(str)){
			account = new TermDepositAccount();
		}
		return account;
	}
}

public class TestAccount {
	
	public static void main(String[] args) {
		
		 Account account = null;
	   AccountFactory af = new AccountFactory();
		
		
		account = af.getAccoutType("saving");
		account.deposit(500.0);
	    account.calculateInterest(100.0);
		System.out.println(account.calculateInterest(100.0));
		//account.calculateIntereset(500.0);
		
		account = af.getAccoutType("term");
		account.deposit(100.0);
	}

}
