package Condition_statements;
import java.util.Scanner;
public class Largenum {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=obj.nextInt();
		System.out.println("Enter the 2nd number");
		int b=obj.nextInt();
		System.out.println("Enter the 3rd number");
		int c=obj.nextInt();
		if ((a>b)&&(a>c))
				System.out.println(a+" is a largest number");
		else if ((b>a)&&(b>c))
			System.out.println(b+ " is largest number");
		else 
			System.out.println(c+" is largest number");
			obj.close();
	}

}

//public class Largenum {
//	public int large(int a,int b,int c) {
//		if ((a>b)&&(a>c)) {
//			return a;
//		}
//		else if ((b>a)&&(b>c)) {
//			return b;
//		}
//		return c;
//
//	}
//	public static void main(String[] args) {
//		Largenum obj=new Largenum();
//		System.out.println("largest number is "+obj.large(10, 20, 30));
//	}
//}
