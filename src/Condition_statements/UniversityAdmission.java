package Condition_statements;

public class UniversityAdmission {
	public String evaluateAdmission(int marks, boolean sportsAchievement) {
	 if(marks>=95 )
		 return "Admitted with Scholarship" ;
	 else if(marks<94 && marks>85)
		 return "Admitted without Scholarship" ;
	 else if(marks<84 && marks>70 && sportsAchievement==true)
		 return "Admitted under Sports Quota";
	 else if(marks<69 && marks>60)
		 return "Interview Required";
	 else
		 return "Admission Rejected";

	}

	public static void main(String[] args) {
		UniversityAdmission obj=new UniversityAdmission();
		System.out.println(obj.evaluateAdmission(96, false));
		System.out.println(obj.evaluateAdmission(80, true));



	}

}
