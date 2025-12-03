package demo;

public class MarksCalculationvariable {
	 static int sub1 = 85;
	 static int sub2 = 90; 
	 static int sub3 = 80;
	 public static void totalMarks(){
	 int t=sub1+sub2+sub3;
	  System.out.println("sum of the sub is "+t);
	 }
	 public static void averageMarks(){
	 double a=(sub1+sub2+sub3)/3;
	 System.out.println("average="+a);
	 }

	public static void main(String[] args) {
		totalMarks();
		 averageMarks();
	}

}
