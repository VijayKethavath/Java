package nov04;

public class example {
	String empname;
	String empdesg;
	double empsalary;

	public String getempname() {
		return empname;
	}
	public void setempname(String name) {
		empname=name;
	}
	public String getempdesg() {
		return empdesg;
	}
	public void setempdesg(String desg) {
		empdesg=desg;
	}
	public double setempsalary() {
		return empsalary;
	}
	public void getempsalary(double salary) {
		empsalary=salary;
	}
	public static void main(String[] args) {
		example obj=new example();
		obj.setempname("Akshiths");
		obj.setempdesg("Software Engineer");
		System.out.println(obj.getempname());
		System.out.println(obj.getempdesg());


	}

}
