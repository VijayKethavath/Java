package Condition_statements;

import java.util.Scanner;
public class check_pos_or_neg {
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter number to check Postive or Negative:");
	int num=scanner.nextInt();
	if(num>0) {
		System.out.println("it is a Postive number");
	}
	else {
		System.out.println("it is a Negative number");
	}
	scanner.close();
}
}
