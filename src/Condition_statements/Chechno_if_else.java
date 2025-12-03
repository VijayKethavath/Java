package Condition_statements;
import java.util.Scanner;

public class Chechno_if_else {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num=scanner.nextInt();
		if (num%2==0){
			System.out.println(num+" is a even number");
		}
		else {
			System.out.println(num+"is a odd number");
		}
		  scanner.close();
	}

}
