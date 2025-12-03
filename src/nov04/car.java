package nov04;

public class car {
	String carMake;
	String carModel;
	int manufacturingYear;
	public void addcarDetails(String make,String model,int year){
		carMake=make;
		carModel=model;
		manufacturingYear=year;

	}
	public String displayDetails() {
		return "car Make:"+carMake+"\n"+"car Model:"+carModel+"\n"+"Manufacturinh year:"+manufacturingYear;

	}

	public static void main(String[] args) {
		car obj=new car();
		obj.addcarDetails("Toyota","Fortuner sigma",2025);
		String result =obj.displayDetails();
		System.out.println(result);


	}

}
