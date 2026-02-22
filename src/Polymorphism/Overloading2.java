package Polymorphism;

public class Overloading2 {
	
	public void print(int a) {
		System.out.println("int");
	}
	public void print(Integer a) {
		System.out.println("Integer");
	}
	
	
	public void print1(long a) {
		System.out.println("long");
	}
	public void print1(Integer a) {
		System.out.println("Integer");
	}
	
	
	public void print2(short a) {
		System.out.println("short");
	}
	public void print2(Integer a) {
		System.out.println("Integer");
	}
 
	public static void main(String[] args) {
		new Overloading2().print(30);  // lnt
		new Overloading2().print1(40); // here the vale is int but here is no int var in print1 method so its go's to the nearest downcasting i.e long
		new Overloading2().print2(40); // here upcasting is not possible so the output is Integer

	}

}
