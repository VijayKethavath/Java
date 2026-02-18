package Program;

class Employe{
	int Empid;
    String empName;
	double [] monthlySalary;
	public Employe(int empid, String empName, double[] monthlySalary) {
		super();
		Empid = empid;
		this.empName = empName;
		this.monthlySalary = monthlySalary;
	}
	double calculateAnnulSalary() {
		double sum=0;
		for(int i=0;i<monthlySalary.length;i++) {
			sum +=monthlySalary[i];
		}
		return sum;
	}
	
	void displayEmployeeDetails() {
		System.out.println("Employee Id:"+Empid);
		System.out.println("Employee name:"+empName);
		System.out.println("Annul Salary:"+calculateAnnulSalary()+"\n");
	}
	
}

public class Emp {
	public static void main(String[] args) {
		Employe emp1=new Employe(22,"vijay",new double[]{1,2,3,4,5,6,7,8,9,0,11,12});
		Employe emp2=new Employe(23,"ajay",new double[]{2,2,3,4,5,6,7,8,9,0,11,12});
		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
		
	}

}
