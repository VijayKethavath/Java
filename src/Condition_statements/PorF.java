package Condition_statements;
import java.util.Scanner;
public class PorF {
	public void getresult(int marks) {
		if(marks>=35) {
			System.out.println("Pass");
			if(marks>=75) {
				System.out.println("Topper");
			}
		}
		else {
			System.out.println("fail");
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=scanner.nextInt();
		PorF obj=new PorF();
		obj.getresult(marks);
		
		scanner.close();
	}

}
