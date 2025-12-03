package nov04;

public class bankdata {
	public static void main(String[] args) {
		bank obj=new bank();
		obj.accountNumber=123654789;
		obj.accountHolderName="vijay";
		obj.balance=1100;
		System.out.println(obj.displaydata());
		obj.balance=11.00;
		System.out.println("updated balance"+obj.getbalance());
	}

}
