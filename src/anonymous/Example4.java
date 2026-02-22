package anonymous;

abstract class Animall{
	
	abstract void sound();
	
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
	
}
public class Example4 {
	

	public static void main(String[] args) {
		
		Animall obj=new Animall() {
			
			void sound() {
				System.out.println("Dog barks");
			}
		};
		
		obj.sound();
		obj.sleep();

	}

}
