package Passing_Objects_as_Arguments;

public class Salay {
	String name;
	double salary;
	public void increaseSalary() {
		salary=salary+(salary*0.10);
		System.out.println("Updated salary:" + salary);
	}

	public static void main(String[] args) {
		Salay s=new Salay();
		s.name="vijay";
		s.salary=50000;
		//System.out.println("Updated salary:" + s.salary+(s.salary*0.10));
		s.increaseSalary();
		
			}
		

		
	}


