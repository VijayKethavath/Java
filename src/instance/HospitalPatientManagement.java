package instance;

public class HospitalPatientManagement {
	static String hospitalName;
	String patientName;
	int age;
	public void printDetails() {
		System.out.println("Hospital Name:"+hospitalName);
		System.out.println("Patient Name:"+patientName);
		System.out.println("age :"+age);
		System.out.println("----------------------");
		
	} 

	public static void main(String[] args) {
		HospitalPatientManagement p1=new HospitalPatientManagement ();
		HospitalPatientManagement p2=new HospitalPatientManagement ();
		p1.hospitalName="Gandi Hospital";
		p1.patientName="Devi";
		p1.age=55;
		p1.printDetails();
		p2.patientName="swetha";
		p2.age=22;
		p2.printDetails();
				
		
		
		
	}

}
