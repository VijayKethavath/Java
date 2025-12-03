package BLC_ELC;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee em=Employee.getEmployeeDetails(1522, "vijay Rathod", 120000.54);
		System.out.println("Employee Id:"+em.getempId()+"\nEmployee Name:"+em.getempName()+"\nEmployee Salary:"+em.getSalary());

	}

}
