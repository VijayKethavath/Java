package Innerclases;

public class RegularInner {
	    String name="Sea Lion";
	
	    class Inner{
		   public void getname() {
			 System.out.println(name+" is playful nature animal");
		} 
	}
			

	public static void main(String[] args) {
	   RegularInner outer=new RegularInner();
	    Inner inner = outer.new Inner();
	   inner.getname();
 
	}

}
