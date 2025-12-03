package Condition_statements;

public class Checkno {
	public String checkNumber(int num) {
		if(num>0) {
			return "Positive";
		}
		if(num<0) {
			return "Negative";
		}
		return "Zero";
	}
	public static void main(String[] args) {
		Checkno obj=new Checkno();
		System.out.println("Check -5:"+obj.checkNumber(-5));
		System.out.println("Check 5:"+obj.checkNumber(5));
		System.out.println("Check 0:"+obj.checkNumber(0));
	}

}
