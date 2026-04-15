package Innerclases;

public class StaticInner {
	static String name="Akshitha";
	 static class Inner{
		 public void display() {
			 System.out.println(name);
		 }
	 }

	public static void main(String[] args) {
	    Inner inner =new Inner();
		inner.display();

	}

}
