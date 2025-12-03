package Condition_statements;
import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your total bill to get Discount:");
		double num=obj.nextInt();
		if(num>=500)
		{
			System.out.println("Discount amount is :"+(num*0.10));
		}
		if(num<500){
			System.out.println("No discount");
		}
		obj.close();

	}

}
