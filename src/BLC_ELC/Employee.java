package BLC_ELC;

public class Employee {
	int empId;
	String empName;
	double empSalary;
	
	int getempId() {
		return empId;
	}
	String getempName() {
		return empName;
	}
	double getSalary() {
		return empSalary;
	}
	void setempId(int id) {
		empId=id;
	}
	void setempName(String name) {
		empName=name;
	}
	void setempSalary(double salary) {
	    empSalary=salary;
	}
	public static Employee getEmployeeDetails(int empId,String empName,double empSalary) {
		Employee e=new Employee();
		e.setempId(empId);
		e.setempName(empName);
		e.setempSalary(empSalary);
		return e;
	}
	
	

}
