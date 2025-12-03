package BLC_ELC;

public class StudentDetails {

	public static void main(String[] args) {
		Student obj= Student.getStudentDetails(22,10,"vijay");
		System.out.println("Student id:"+obj.getid());
		int result=obj.getrollNo();
		System.out.println("Student Rollno:"+result);
		String result1=obj.getname();
		System.out.println("Student name:"+result1);
		//System.out.println(obj);


		//		Student st= Student.getStudentDetails(22,10,"vijay");
		//		System.out.println("Student id:"+st.getid());
		//		int result=st.getrollNo();
		//		System.out.println("Student Rollno:"+result);
		//		String result1=st.getname();
		//		System.out.println("Student name:"+result1);
		//		
	}

}
