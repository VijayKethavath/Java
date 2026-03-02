package ExceptionHandling;

// Example for ArrayIndexOutOfBoundsException

public class Example2 {

	public static void main(String[] args) {
		int[] arr= {10,20,30};
		
		try {
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.err.println("Error by ArrayIndexOutOfBoundsException");
		}
		
		System.out.println("Program Ended.....");
		
		

	}

}
