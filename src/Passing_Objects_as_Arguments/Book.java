package Passing_Objects_as_Arguments;

public class Book {
	String title;
	String Anthor;
	public void addbook(String t,String a) {
		title=t;
		Anthor=a;
		System.out.println(title+":The Complete Reference by "+Anthor);
		
	}

	public static void main(String[] args) {
		Book b=new Book();
		b.addbook("Java","Herbert schildt");

	}

}
