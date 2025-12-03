package Condition_statements;

public class Division {
	public boolean isDivisibleby(int num) {
		if(num%5==0) {
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
	   Division obj=new Division();
	   System.out.println("Is 15 divisible by 5?"+obj.isDivisibleby(15));

	}

}
