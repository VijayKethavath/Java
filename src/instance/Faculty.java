package instance;

public class Faculty {
	static String universityName;
	String facultyName;
	String  department;
	public void FacultyDetails() {
		System.out.println("university Name:"+universityName);
		System.out.println("faculty Name:"+facultyName);
		System.out.println(" department:"+ department);
		System.out.println("----------------------");
		
	} 

	public static void main(String[] args) {
		Faculty p1=new Faculty ();
		Faculty p2=new Faculty ();
		p1.universityName="Stanford University";
		p1.facultyName="Dr. Robert Brown";
		p1. department="Computer Science";
		p1.FacultyDetails() ;
		p2.facultyName="Dr. Lisa Green";
		p2. department="physics";
		p2.FacultyDetails() ;
				
	}

}
