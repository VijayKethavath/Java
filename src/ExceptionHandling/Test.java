package ExceptionHandling;
import java.util.Scanner;
class Handling{
	public static void tiMethod(int num) {
		try {
			System.out.println("10000");
			tilMethod(num);
			System.out.println("Coders");
		}
		catch(Exception e) {
		   System.out.println(e.getMessage());
		}
	}
	
	public static void tilMethod(int val) throws Exception{
		try {
			int result=100/val;
			if(val==10) {
				throw new Exception("custom exception");
			}
			System.out.println("Completed");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException:"+e.getMessage());
		}
		finally {
			System.out.println("Finally");
		}
	}
}
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input:");
		int n=sc.nextInt();
	   Handling.tiMethod(n);
	   sc.close();
		
		

	}

}
