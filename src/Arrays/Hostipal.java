package Arrays;

class Patient{
	String patientId;
	String name;
	double[] testresult;
	public Patient(String patientId, String name, double[] testresult) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.testresult = testresult;
	}
	
	double hasAverageResult() {
		double sum=0;
		for(double res : testresult) {
			sum=sum+res;
		}
		 return sum / testresult.length;
		
	}
	
	boolean hasCriticalValues() {
		for(int i=0;i<=testresult.length-1;i++) {
			if(testresult[i]>=50) {
				return true;
			}
		}
		return false;
	}
	void displayPatientReport() {
		System.out.println("Patient Id:"+patientId);
		System.out.println("Name:"+name);
		System.out.print("Tets Result :");
		for(double res:testresult) {
			System.out.print(res+" ");
		}
		System.out.println("");
		System.out.println("Avereage Result:" + hasAverageResult());
	}
}

public class Hostipal {

	public static void main(String[] args) {
		Patient p1=new Patient("100","Anji", new double[]{50,60,75,45,62});
		Patient p2=new Patient("101","Swarupa", new double[]{10,60,75,45,62});
		Patient p3=new Patient("102","Nikhil", new double[]{10,20,35,25,12});
		Patient p4=new Patient("103","nikhitha", new double[]{10,10,25,15,32});
		Patient p5=new Patient("104","Akshitha", new double[]{50,60,75,45,62});
		
		Patient[] patients= {p1,p2,p3,p4,p5};
		
		System.out.println("patients with critical value \n");
		for(Patient p:patients) {
			if(p.hasCriticalValues()) {
				p.displayPatientReport();
				System.out.println("---------------------------------------\n");
			}
		}
	
	}

	}





//Scenario 1: Hospital Management System
//You are developing a mini module for a hospital to track patients and their test
//results.
//Question:
//Create a class Patient with the following details:
//patientId (int)
//name (String)
//testResults (array of 5 doubles representing results from 5 medical tests)
//Implement the following:
//1. A constructor to initialize all attributes.
//2. A method getAverageResult() to calculate the average test result.
//3. A method hasCriticalValues() that returns true if any test result is below
//50.
//4. A method displayPatientReport() to show all patient information.
//In the main method:
//Create an array of 5 Patient objects with sample data.
//Display reports only for patients who have critical values.
//
//
////Creating array of 5 Patient objects
///
///
///
///
///
//Patient[] patients = new Patient[5];
//
//patients[0] = new Patient(101, "John", new double[]{65, 72, 80, 90, 88});
//patients[1] = new Patient(102, "Alice", new double[]{45, 60, 55, 70, 68});
//patients[2] = new Patient(103, "Bob", new double[]{78, 82, 85, 88, 90});
//patients[3] = new Patient(104, "Emma", new double[]{49, 52, 60, 58, 65});
//patients[4] = new Patient(105, "David", new double[]{90, 92, 88, 91, 95});
//
//// Display reports only for patients with critical values
//System.out.println("Patients with Critical Test Values:\n");
//for (Patient p : patients) {
//    if (p.hasCriticalValues()) {
//        p.displayPatientReport();
//    }
//}
//
//
