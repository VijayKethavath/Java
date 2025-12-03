package Condition_statements;

public class admin {
	public String getaccess(String name) {
		if (name=="admin") {
			return "access Granted";
		}
		return "not Granted";
			
	}

	public static void main(String[] args) {
		admin obj=new admin();
		System.out.println(obj.getaccess("admin"));
	}

}
