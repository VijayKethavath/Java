package demo;

public class SquareandCube {
  static int num=5;
  public static void square() {
  int s=num*num;
	  
 }

     public static void cube() {
	 square();
	 int c=num*num*num;
	 System.out.println("cube of 5="+c);
		    
  }
  
	  public static void main(String[] args) {
		cube();
	}

}
