package ExceptionHandling;

// Example Multiple Catch Blocks

public class Example3 {

	public static void main(String[] args) {
		
		int [] arr =new int[3];
		
		try {
			int result=10/2;
			System.out.println(result);
			System.out.println(arr[6]);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		}
		
		
		
		

	}

}
