package demo;

public class CombineLocalandStatic {
    static int rate =10;
    
    	
    public static void calculateAmount() {
         int amount=500;
         int t=rate+amount;
         System.out.println("total is "+t);
          
    }
	public static void main(String[] args) {
		calculateAmount(); 

	}

}
