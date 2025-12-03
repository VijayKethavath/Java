package demo;


public class variable2 {
	static double radius=5;
	public static void area() {
		double area=Math.PI*radius*radius;
		System.out.println("area of the circle"+area);
				
	}
	public static void perimeter() {
		double perimeter=2*Math.PI*radius;
		System.out.println("perimeter of the circle"+perimeter);
	}

	public static void main(String[] args) {
		area();
		perimeter(); 
	}

}
