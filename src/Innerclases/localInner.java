package Innerclases;

public class localInner {
	public void method(){
		class Inner{
			public void display() {
				System.out.println("This the Local inner class");
			}
		}
		
		Inner inner = new Inner();
		inner.display();
	}

	public static void main(String[] args) {
		localInner outer=new localInner();
		outer.method();

	}

}
