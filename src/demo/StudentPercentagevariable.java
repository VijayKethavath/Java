package demo;

public class StudentPercentagevariable { 
	 static int marks1 = 78;
	 static int marks2 = 85;
	 static int marks3 = 90;
	 public static void total() {
		int t=marks1+marks2+marks3;
		System.out.println("total="+t);
		
		
	 }
	 public static void percentage() {
		 total();
		 double p=(marks1+marks2+marks3)/300.0*100;
		 System.out.println("percentage="+p);
		 
	 }

	public static void main(String[] args) {
		percentage();
	}

}
