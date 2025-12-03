package nov04;

public class employee {
	String employeeName;
	int employeeId;
	long  employeeSalary;
	public void addEmployeeDetail(String name,int Id,long salary) {
		employeeName=name;
		employeeId=Id;
		employeeSalary=salary;

	}
	public String displayDetails() {
		return "employee Name:"+employeeName+"\n"+"employee Id: "+employeeId+"\n"+"employee Salary:"+employeeSalary;

	}


	public static void main(String[] args) {
		employee obj=new employee();
		obj.addEmployeeDetail("vijay",21,30000);
		System.out.println(obj.displayDetails());


	}

}
