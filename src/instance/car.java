package instance;

public class car {
	  static String showroomName;
	  String carName;
	  int carprice;
	  public void displayDetails() {
		 System.out.println("Showroom Name ="+showroomName);
		 System.out.println("car Name="+carName);
		 System.out.println("Car prince="+ carprice);
		 System.out.println("____________________");
		  
	  } 

	public static void main(String[] args) {
		 car car1=new car();
		  car car2=new car();
		  car1.showroomName="Elite Motors";
           car1.carName="Tesla Model S";
           car1.carprice=8000;
            car1.displayDetails();
            
            car2.carName="BMW X5";
            car2.carprice=7500;
             car2.displayDetails();

	}

}
