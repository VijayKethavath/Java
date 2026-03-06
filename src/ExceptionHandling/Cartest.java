package ExceptionHandling;
import java.util.Scanner;

public class Cartest {

	public static void stop(String msg) throws CarStopped {
		if(msg.equals("stop")) {
			throw new CarStopped("Car is stopped");
		}
		else {
			System.out.println("Car not stalled");
		}
	}

	public static void puncture(String msg) throws CarPuncture{
		if(msg.equals("puncture")) {
			throw new CarPuncture("Car is Punctured");
		}
		else {
			System.out.println("not Punctured");
		}
	}
	public static void carHeat(int val) throws CarHeat{
		if(val>50) {
			throw new CarHeat("car is heated more than 50 degrees");
		}
		else {
			System.out.println("Car not stalled");
		}
	}

	public static void main(String[] args) {
		
		try {
			stop("stop");
		}
		catch(CarStopped e) {
			System.out.println("Carstopped: "+e.getMessage());
		}
		try {
			puncture("not puncture");
		}

		catch(CarPuncture e) {
			System.out.println("Punctured :"+e.getMessage());
		}
		try {
			carHeat(60);
		}
		catch(CarHeat e) {
			System.out.println("Heat:"+e.getMessage());
		}

	}

}



//Scanner sc=new Scanner(System.in);
//		System.out.println("Enter input:");
////		String input=sc.nextLine();
//		try {
//			String input=sc.nextLine();
//			stop(input);
//		}catch(CarStopped e) {
//			System.out.println("Carstopped: "+e.getMessage());
//		}
//		try {
//			String input=sc.nextLine();
//			puncture(input);
//		}catch(CarPuncture e) {
//			System.out.println("Punctured :"+e.getMessage());
//		}
//		try {
//			int input=sc.nextInt();
//			carHeat(input);
//		}catch(CarHeat e) {
//			System.out.println("Heat:"+e.getMessage());
//		}
//		sc.close();
