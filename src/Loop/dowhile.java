package Loop;

public class dowhile {
	public void getno(int no) {
		 int i=1;
		do {
			System.out.print(i+" ");
			i++;
		} while (i<=no);
		
	}

	public static void main(String[] args) {
	    new dowhile().getno(10);
	}

}
