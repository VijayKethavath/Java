package Lambda;

interface Cal{
	void value(int a,int b);
}

public class Test {

	public static void main(String[] args) {
		
		//Functional 
	    Cal c = new Cal() {
	    	public void value(int a,int b) {
                	    System.out.println(a+b);		
	    	}
	    };
	    c.value(2,2);
	    
	    //Lamda
	    Cal d =(a,b)->{
	    	System.out.println(a+b);
	    };
	    d.value(1, 2);

	}

}
