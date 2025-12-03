package Passing_Objects_as_Arguments;

public class Student {
	static String name;
	static int mark;

	public static void  printDetails() {
		System.out.println("Student Name:"+name);
		System.out.println("Marks:"+mark);			
	}


	public static void main(String[] args) {
		name="vijay";
		mark=92;
		printDetails();

	}

}
