package Execeptoin;

//unchecked
public class Throw {

	public static void main(String[] args) {
		int age = 10;
		 if(age<18) {
			 throw new RuntimeException("Not eligible");
		 }
		 System.out.println("eligible");

	}

}
