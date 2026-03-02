package ExceptionHandling;

//Example for ArithmeticException

public class Example {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			int result=a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Error :"+e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program Ended...");

	}

}
