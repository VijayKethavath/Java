package Polymorphism;

public class Overloading {
	
	
	public void add(int a,int b) {
		System.out.println("int:" +( a+b));
		
	}
	
	public void add(int a,int b,int c) {
		System.out.println("int:"+ (a+b+c));
		
	}
	public void add(double a,double b) {
		System.out.println("double:"+ (a+b));
	}
	public void add(int a,double b) {
		System.out.println("int double:"+ (a+b));
	}
	

	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.add(10, 20);
		obj.add(10, 20,50);
		obj.add(10.0, 20.0);
		obj.add(10, 20.0);
		obj.add(10.0, 20); // type casting will happen it convert into double


	}

}
