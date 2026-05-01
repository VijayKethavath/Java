package Collection;
import java.util.*;

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}






public class EmployeeManagementSystem {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("\nEmployee Management ");
			System.out.println("1. Add Employee\r\n"
					+ "2. Display All Employees\r\n"
					+ "3. Find Highest Salary Employee\r\n"
					+ "4. Increase Salary by Percentage\r\n"
					+ "5. Exit\r\n"
					+ "");

			System.out.print("Enter one choice : ");
			int choice = sc.nextInt();

			switch(choice){

			case 1:{
				System.out.print("\nEnter ID :");
				int id = sc.nextInt();
				sc.nextLine();

				for(Employee e:list) {
					if(e.id == id) {
						System.out.println("ID is already exists");
						return;
					}
				}
					System.out.print("Enter Employee Name : ");
					String name = sc.nextLine();
					System.out.print("Enter Salary : ");
					double salary = sc.nextDouble();

					if(salary<0) {
						System.out.println("Salary should not be negative"); 
						return;
					}
					list.add(new Employee(id,name,salary));
					System.out.println("Employee added successfully");
					break;
			 }
			
			case 2:{
				if(list.isEmpty()) {
					System.out.print("No employees found");
					return;
				}
				System.out.println("\nEmployee Details");
				for(Employee e:list) {
					System.out.println("ID :"+e.id + " , Name :"+e.name + " , Salary :"+e.salary);
				}
				break;
				
			}
			
			case 3:{
				if(list.isEmpty()) {
					System.out.println("No Employee found");
				}
				
				Employee max=list.get(0);
				System.out.println("\nHighest Salary Employee:");
				for(Employee e:list) {
					if(e.salary>max.salary) max=e;
				}
				System.out.println("ID :"+max.id + " , Name :"+max.name + " , Salary :"+max.salary);
				break;
			}
			
			case 4:{
				if(list.isEmpty()) {
					System.out.println("No Employee found");
				}
				
				System.out.print("\nEnter percentage : ");
				double pr=sc.nextDouble();
				for(Employee e:list) {
					e.salary += e.salary * pr / 100;
				}
				System.out.println("Salary updated successfully");
				break;
				
			}
			case 5:{
				System.out.println("Thank you...");
				return;
			}
			 default:{
				 System.out.println("Invalid Choice");
			 }
	       }	
		}
//				sc.close()
	}
}
