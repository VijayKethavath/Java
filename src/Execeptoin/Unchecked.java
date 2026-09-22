package Execeptoin;

public class Unchecked {

	public static void main(String[] args) {
	  int a =10;
	  int b = 0;
//	  System.out.println(a/b);
	  try {
		  System.out.println(a/b);
	  }
	  catch(Exception e) {
	  e.printStackTrace();
	  }
	  finally{
		  System.out.println("This is Unchecked Execpion");
	  }

	}

}
