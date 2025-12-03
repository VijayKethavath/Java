package demo;

public class SimpleInterestavriable {
	static int principal = 5000;
	static int rate = 5;
	static int time = 2;
	public static void SimpleInterest(){
	  int s=(principal * rate * time)/100;
	  System.out.println("simple interset ="+s);
	  }

	public static void main(String[] args) {
		SimpleInterest();

	}

}
