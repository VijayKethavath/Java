package anonymous;
abstract class Animals{
	
	abstract void sound();
	
	public void sleep() {
		System.out.println("Aminal is Sleeping");
	}
	
}

class Dog extends Animals{
	void sound() {
		System.out.println("Dog barks");
	}
}
public class Ex3 {

	public static void main(String[] args) {
		Animals obj=new Dog();
		obj.sound();
		obj.sleep();
		
		

	}

}
