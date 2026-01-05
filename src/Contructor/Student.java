package Contructor;

class Studenta{
	public Studenta() {
		this(4);
		System.out.println("cse");
	}
	public Studenta(int a) {
		System.out.println("vijay");
		System.out.println("roll no:"+a);
	}
}

class details extends Studenta{
	public details() {
		this(5);
		System.out.println("ece"); 
	}
	public details(int c) {
		System.out.println("Ajay"); 
		System.out.println("roll no :"+c);
	}
}
public class Student{
	public static void main(String[] args) {
		new details();

	}
}
