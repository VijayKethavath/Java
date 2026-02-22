package Polymorphism;

class A{
    public void print(int a) {
    	System.out.println("Parent class");
    }
}
class B extends A{
	public void print(double a) {
    	System.out.println("child class");
    }
}
class C{
	public void print( Integer a) {
		System.out.println("C Parent class");
	}
}
class D extends C{
	public void print(double a) {
		System.out.println("D child class");
	}
}

public class Overloading3 {
	public static void main(String[] args) {
		A a=new B();
		a.print(20);    
		
		A a1=new B();
		a1.print(20);
		
		B b=new B();
		b.print(20);
		
		B b1=new B();
		b1.print(20.0);
		
		D a2=new D();
		a2.print(20); // downcasting
		
		
		
	}

}
