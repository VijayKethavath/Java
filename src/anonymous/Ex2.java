package anonymous;


abstract class demo{
  public abstract void print();
}

public class Ex2{
	public static void main(String[] args) {
		demo obj=new demo() {
			
			public void print() {
				System.out.println("This the Demo program of the anonymous class");
			}
		};
		
		obj.print();
	}
}