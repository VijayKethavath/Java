package demo;

public class variable {
         static int a=20;
         static int b=30;
	public static void sum(){
		 int sum=a+b;
		System.out.println("sum="+sum);
	}
	public static void average(){
		sum();
		double avg=(a+b)/2;
		System.out.println("average="+avg);
		
		
	}
	public static void main(String[] args) {
        average();
        
		
	}

}
