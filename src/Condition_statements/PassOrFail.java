package Condition_statements;

import java.util.Scanner;
public class PassOrFail {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Temperature:");
		int num=obj.nextInt();
		if(num>=30)
		System.out.println("HOT temperature");
		if(num<30)
			System.out.println("normal temperature");
		obj.close();
	}

}
