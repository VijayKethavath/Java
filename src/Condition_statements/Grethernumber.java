package Condition_statements;

public class Grethernumber {
	public int findGreater(int num1,int num2) {
		if (num1>num2) {
			return num1;
		}
		return num2;
	} 

	public static void main(String[] args) {
	 Grethernumber obj=new Grethernumber();
	 System.out.println("greather number (10,20):"+obj.findGreater(10, 20));
	}

}
