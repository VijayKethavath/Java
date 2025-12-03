package Condition_statements;
import java.util.Scanner;

public class mathscal {
     
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice you want");
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.multiple");
		System.out.println("4.division");
		int choice=sc.nextInt();
		System.out.println("Enter 1st number:");
		int n1=sc.nextInt();
		System.out.println("Enter 1st number:");
		int n2=sc.nextInt();
		switch(choice){
		case 1:System.out.println("Result:"+(n1+n2));break;
		case 2:System.out.println("Result:"+(n1-n2));break;
		case 3:System.out.println("Result:"+(n1*n2));break;
		case 4:System.out.println("Result:"+(n1/n2));break;
		default:System.out.println("Invaild choice");break;
			
		}
		sc.close();
	
	

	}

}
