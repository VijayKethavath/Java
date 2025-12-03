package Condition_statements;
import java.util.Scanner;
public class div {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number to check that is is divisible by both 5 and 11:");
		int num=obj.nextInt();
		if ((num%5==0)&&(num%11==0)) {
			System.out.println(num+":is  divisible by both 5 and 11");
		}
		else {
			System.out.println(num+":is not divisible by both 5 and 11");
		} obj.close();
	} 

}
