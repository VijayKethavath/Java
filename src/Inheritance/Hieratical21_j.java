package Inheritance;
class vechicle{
	String make;
	String model;
	int year;

	public vechicle(String make,String model,int year) {
		this.make=make;
		this.model=model;
		this.year=year;
	}

	public void displayInfo() {
		System.out.println(make+" "+model+" "+year+" ");
	}
}
class Car extends vechicle{
	int noofdoor;

	public Car(String make, String model, int year, int noofdoor) {
		super(make, model, year);
		this.noofdoor = noofdoor;
	}

	public void displaycarInfo() {
		System.out.println("no of doors :"+noofdoor);
	}
}
class Truck extends Car{
	int kg;

	public Truck(String make, String model, int year, int noofdoor, int kg) {
		super(make, model, year, noofdoor);
		this.kg = kg;
	}
	public void displaytrackInfo() {
		System.out.println("cargoCapacity :"+kg+"kg");
	}
	
}

class motorcycle extends Truck{
	boolean hassidecar;

	public motorcycle(String make, String model, int year, int noofdoor, int kg, boolean hassidecar) {
		super(make, model, year, noofdoor, kg);
		this.hassidecar = hassidecar;
	}
	public void displaymInfo() {
		System.out.println("Has Sidecar:"+hassidecar);
	}	
}

public class Hieratical21_j {
	public static void main(String[] args) {
		vechicle vh=new Car("toyota","corolla",2003,4);
		Car car=(Car)vh;
		car.displayInfo();
		car.displaycarInfo();
		System.out.println("\n");
		
		vechicle tr=new Truck("Ford", "F-150", 2021,4, 1000);
		Truck truck=(Truck)tr;
		truck.displayInfo();
		truck.displaycarInfo();
		truck.displaytrackInfo();
		System.out.println("\n");
		
		vechicle motor = new motorcycle("Harley-Davidson", "Street Glide", 2023, 4,1000,true); 
		motorcycle mc=(motorcycle)motor;
		mc.displayInfo();
		mc.displaycarInfo();
		mc.displaytrackInfo();
		mc.displaymInfo();
	
	}
}