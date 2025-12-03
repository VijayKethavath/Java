package nov04;

public class bank {
	long accountNumber;
	String accountHolderName ;
	double balance;
	public long getnumber() {
		return accountNumber;
	}
	public String getname() {
		return accountHolderName;
	}
	public double getbalance() {
		return balance;
	}
	public void setnumber(long no) {
		 accountNumber=no;
	}
	public void setname(String name) {
		accountHolderName=name;
	}
	public void setbalance(double bl) {
		balance=bl;
	}
	public String displaydata() {
		return "accountNumber:"+accountNumber+"\naccountHolderName:"+accountHolderName+"\nbalance:"+balance;
	}
	
	
	

}
