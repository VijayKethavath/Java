package Condition_statements;

public class Vote {
	public boolean canvote(int age) {
		if(age>=18) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Vote obj=new Vote();
		System.out.println("Can vote (Age 20)?:"+ obj.canvote(20));
		System.out.println("Can vote (Age 10)?:"+ obj.canvote(10));

	}

}
