package ExceptionHandling;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		try {
			System.out.println("Enter your Name :");
			String name=sc.nextLine();
			if(name.isEmpty()){
				throw new Exception("Name cant be Empty");
			}
			System.out.println("your Name :"+name+"\n");
			
			
			System.out.println("Enter your age:");
			int age=sc.nextInt();
			if(age<18) {
				throw new ArithmeticException("Age must be 18+");
			}
			System.out.println("your age Is :"+age);
			
		}
		catch(ArithmeticException a) {
			System.err.println(a);
		}
		catch(Exception e) {
			System.err.println(e);
		}	
		finally {
			System.out.println("Program End...");
			sc.close();
		}

	}

}
