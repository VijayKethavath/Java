package Execeptoin;

public class Throw1 {

	public static void main(String[] args) throws Exception {
		int age = 10;
		
		if(age<18) {
			throw new Exception("Not Eligible");
		}
		
		System.out.println("Eligible");
		

	}

}
