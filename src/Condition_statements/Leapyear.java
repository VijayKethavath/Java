package Condition_statements;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a year to check it's leap year or not:");
		int yr=scanner.nextInt();
		if((yr % 400==0)||(yr %4 ==0 && yr % 100!=0)) {
			System.out.println(yr+" is a Leap year");
		}
		else {
			System.out.println(yr+" is a not a Leap year");
		}
		scanner.close();
	}

}
