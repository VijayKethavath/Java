package Test;

public class Middle_Letter {
	public void getword(String word) {
		int len=word.length();
		  if(len%2==1) {
			  int mid=len/2;
			  System.out.println("Middle letter : "+word.charAt(mid));
		  } 
		  else {
			   int mid=(len/2)-1;
			   int mid2=(len/2);
			   System.out.println("Middle letter :"+word.charAt(mid)+word.charAt(mid2));
		  }

	}

	public static void main(String[] args) {
		new Middle_Letter().getword("Akshitha");
		new Middle_Letter().getword("Vijay");
		
	}

}
