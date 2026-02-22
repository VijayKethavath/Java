package Polymorphism;

public class Overloading1 {
	
	public static void add(short a,short b) {
		System.out.println("Short :"+(a+b));
	}
	
	public static void add(int a,int b) {
		System.out.println("int :"+ (a+b));
	}
	
	public static void add(float a,float b) {
		System.out.println("float :" +(a+b));
	}
	public static void add(double a, double b) {
		System.out.println("double :" +(a+b));
	}

	public static void main(String[] args) {
		add(10, 20); // it execute the int to excute we need to downcasting
		
		short s=10;
		short s1=20;
		add(s,s1);
		
		add(10.0,20.0);   // double
		add(10.0f,20.0f); // float
		add(10.0f,20.0);  // double
		add(10.0f,20);    // float
		add(10,20.0f);    // float
	}

}
