package Collection;
import java.util.*;

class Employe{
	int id;
	String name;
	double salary;
	public Employe(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}

class Task{
	int taskId;
	String taskName;
	String assignedTo;
	public Task(int taskId, String taskName, String assignedTo) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.assignedTo = assignedTo;
	}
}

class SupportRequest{
	int requestId;
	String employeeName;
	String issue;
	public SupportRequest(int requestId, String employeeName, String issue) {
		super();
		this.requestId = requestId;
		this.employeeName = employeeName;
		this.issue = issue;
	}
	

	

}

public class EmployeeTask_Support_Ssytem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Employe> employee = new ArrayList<>();
		LinkedList<Task> task = new LinkedList<>();
		Queue<SupportRequest> supportQueue = new LinkedList();

		while(true) {
			System.out.println("\nEMPLOYEE TASK & SUPPORT SYSTEM");
			System.out.println("1. Add Employee\r\n"
					+ "2. Display Employees\r\n"
					+ "3. Assign Task\r\n"
					+ "4. Display Tasks\r\n"
					+ "5. Add Support Request\r\n"
					+ "6. Process Support Request\r\n"
					+ "7. Highest Salary\r\n"
					+ "8. Increase Salary\r\n"
					+ "9. Search employee by ID\r\n"
					+ "10. Delete employee\r\n"
					+ "11. Average salary\r\n"
					+ "12. Exit\r\n"
					+ "");

			System.out.print("Enter the choice: \n");
			int choice =sc.nextInt();

			switch(choice)
			{

			  case 1:
			  {
				System.out.print("Enter Employee Id: ");
				int id = sc.nextInt();

				for(Employe e:employee) {
					if(id==e.id) {
						System.out.println("Id is already exits..");
						break;
					}	
				}
				System.out.print("Enter Employee Name: ");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println("Enter Salary: ");
				double sal = sc.nextDouble();
				
				if(sal<=0) {
					System.out.println("Salary must be postive");
					break;
				}
				employee.add(new Employe(id,name,sal));
				System.out.println("Employee added successfully");
				break;
			 }   
			  
			  case 2:
			  {
				  if(employee.isEmpty()) {
					  System.out.println("No employee found");
					  break;
				  }
				  System.out.println("Employee Details");
				  for(Employe e:employee) {
					  System.out.println("ID :"+e.id + " , Name :"+ e.name + " , Salary :"+e.salary);
				  }
				  break;  
			  }
			  
			  case 3:{
				  System.out.print("Enter task id: ");
				  int tid = sc.nextInt();
				  
				  System.out.println("Enter task name: ");
				  sc.nextLine();
				  String tname = sc.nextLine();
				  
				  System.out.print("Assigned To: ");
				  String ass=sc.nextLine();
				  
				  task.add(new Task(tid,tname,ass));
				  System.out.println("Task Assigned: ");
				  break;
			  }
			  
			  case 4:{
				 if(task.isEmpty()) {
					 System.out.println("No Task Found");
					 break;
				 }
				 for(Task t:task) 
				 {
					 System.out.println(t.taskId + " " + t.taskName + " -> " + t.assignedTo);
				 }	 
				 break;
			  }
			  
			  case 5:{
				  System.out.print("Enter Request Id: ");
				  int rid = sc.nextInt();
				  
				  System.out.print("Enter Employee Name: ");
				  sc.nextLine();
				  String rname = sc.nextLine();
				  
				  System.out.println("Enter Issue: ");
				  String iss = sc.nextLine();
				  
				  supportQueue.add(new SupportRequest(rid,rname,iss));
				  System.out.println("Request Added");
				  break;  
			  }
			  
			  case 6:{
				  if(supportQueue.isEmpty()) {
					  System.out.println("No Request found ");
					  break;
				  }
				  SupportRequest req = supportQueue.poll();
				  System.out.println("Processing:" + req.employeeName+" - "+req.issue);
				  System.out.println("Remaining Queue : "+supportQueue.size());
				  break;
			  }
			  
			  case 7:{
				  if(employee.isEmpty()) {
					  System.out.println("No employee found");
					  break;
				  }
				  System.out.println("Employee with Highest Salary");
				  Employe max=employee.get(0);
				  for(Employe e:employee) {
					  if(max.salary<e.salary) {
						  max=e;
					  }
					  System.out.println("ID :"+e.id + " , Name :"+ e.name + " , Salary :"+e.salary);
				  }
				  break;  
			  }
			  
			  case 8:{
				  if(employee.isEmpty()) {
					  System.out.println("No employee found");
					  break;
				  }
				  System.out.print("Enter  Percentage");
				  double p = sc.nextDouble();
				  for(Employe e:employee) {
					  e.salary = e.salary*p/100;
				  }
				  System.out.println("Salary updated successfull");
			  }
			  
			  case 9:{
				  System.out.print("Enter Employee Id to Search: ");
				  int sid=sc.nextInt();
				  
				  for(Employe e:employee) {
					  if(e.id == sid) {
						  System.out.println("ID :"+e.id + " , Name :"+ e.name + " , Salary :"+e.salary);
					  }
					  else {
						  System.out.println("No employee found");
					  }
				  }
				  break;
			  }
			  
			  case 10:{
				  System.out.println("Enter Employee Id to delete");
				  int del = sc.nextInt();
				  
				  Iterator<Employe> it = employee.iterator();
				  while(it.hasNext()) {
					  Employe e = it.next();
					  if(e.id == del) {
						  it.remove();
						  System.out.println("Employee Deleted");
					  }
					  else {
					  System.out.println("Employee Not found");
					  }
				  }
				  break;
			  }
			  
			  case 11:{
				  double sum=0;
				  
				  for(Employe e:employee) {
					  sum += e.salary;
				  }
				  System.out.println("Average salary:"+(sum/employee.size()));
				  break;
			  }
			  
			  case 12:{
				  System.out.println("Thank you..");
				  return;
			  }
			  default:{
				  System.out.println("Invalid Choice");
				  break;
			  }
			  
			}

		}




	}

}
