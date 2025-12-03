package Condition_statements;

public class Myclass {
	public boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Myclass obj=new Myclass();
		System.out.println("is 10 Even?"+obj.isEven(10));
		System.out.println("is 15 Even?"+obj.isEven(15));
		System.out.println("is 02 Even?"+obj.isEven(02));
	}

}
