package BLC_ELC;

public class Student {
	int id;
	int rollNo;
	String name;

	public int getid() {
		return id;
	}
	public int getrollNo() {
		return rollNo;
	}
	public String getname() {
		return name;
	}
	public void setid(int sid) {
		id=sid;
	}
	public void setrollNo(int sno) {
		rollNo=sno;
	}
	public void setname(String sname) {
		name=sname;
	}
	public static Student getStudentDetails(int id,int rollNo,String name) {
		Student st=new Student();
		st.setid(id);
		st.setrollNo(rollNo);
		st.setname(name);
		//System.out.println(st);
		return st;
	}

}
