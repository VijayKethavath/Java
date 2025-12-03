package Test;

import java.util.Scanner;
public class Middle_digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the digits to find the middle digit of a number :");
		String digit=sc.nextLine();
		int len=digit.length();
		if(len%2==1) {
			int mid=len/2;
			System.out.println("Middle digit is:"+digit.charAt(mid));
		}
		else {
			int mid=(len/2)-1;
			int mid2=(len/2);
			System.out.println("Middle digit are :"+digit.charAt(mid)+" and "+digit.charAt(mid2));
		}sc.close();
	} 

}
