package Passing_Objects_as_Arguments;

public class Car {
	String brand;
	double price;
}

class Showroom {
	public void displaycar(Car c) {
		System.out.println("Car brand:"+c.brand);
		System.out.println("car price:"+c.price);
	}
	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="Telsa";
		car1.price=75000.5;
		Showroom sr=new Showroom();
		sr.displaycar(car1);
	}

}

