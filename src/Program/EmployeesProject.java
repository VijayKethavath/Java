package Program;

class Employee{
	String Empname;
	String EmpId;
	String Demp;

	void setEmpdetails(String name,String id,String dep){
		Empname=name;
		EmpId=id;
		Demp=dep;
	}
	void dispalyEmpDetails() {
		System.out.println("Name: "+Empname);
		System.out.println("Employee Id :"+EmpId);
		System.out.println("Department :"+Demp);
	}
}
class ProjectEmployee extends Employee{
	String ProjectName;
	String ProjectRole;
	int performance[]=new int[3];

	void setproDetail(String pname,String prole) {
		ProjectName =pname;
		ProjectRole=prole;
	}
	void setPerformanceScores(int[] scores) {
		for (int i = 0; i < 3; i++) {
			performance[i] = scores[i];
		}
	}
	void  updateprojectname(String newname) {
		if(newname !=null || newname.equals(" ")) {
			System.out.println("Invaid Projectname");
		}
		else {
			ProjectName=newname;
		}
		
	}
}

public class EmployeesProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
