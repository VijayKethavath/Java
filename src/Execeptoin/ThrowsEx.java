package Execeptoin;

public class ThrowsEx {
	
	 static void display() throws ArithmeticException {
		int a = 10/0;
		System.out.println(a);
	}
	 
	 +
	public static void main(String[] args) {
		
		display();

	}

}
