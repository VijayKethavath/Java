package demo;

public class mployeeSalaryUpdatevariable {
	static int basic = 20000;
	static int bonus = 5000;
	public static void calculateSalary() {
		int s=basic+bonus;
		System.out.println("total employeesalary= "+s);
	}
	public static void main(String[] args) {
		calculateSalary();
	}

}
