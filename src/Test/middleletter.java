package Test;

public class middleletter {

	public static void main(String[] args) {
	  String word="AKSHITHA";
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

}
