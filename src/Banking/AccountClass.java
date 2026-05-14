package Banking;

abstract class AccountClass {
	private double balance;



	public AccountClass(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}




	public void  withdraw(double amount) {
		
		if(balance>amount) {
			System.out.println("low balance");
		}
		else {
			balance=balance-amount;
			System.out.println("Withdtaw successfull availble balnce : "+balance);
		}

	}
	
	public void deposit(double amount) {
		balance = balance+amount;
		
	}

}

class SavingAccount extends AccountClass{

	public SavingAccount(double balance) {
		super(balance);
	
	}
	
     
}
