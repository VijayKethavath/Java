package Wrapper;

public class manual {

	public static void main(String[] args) {
		int a=10;
		Integer i=Integer.valueOf(a);  // pri to non-pri
		System.out.println(i);
		
		Integer j=new Integer(i);
		System.out.println(j);
		
		Integer k=a;                    //non-pri to pri
		System.out.println(k);
		
		
		Integer m=20;
		int n=Integer.valueOf(m);
		System.out.println(n);
		
		int l=m.intValue();
		System.out.println(l);
		
//		int q=m.parseInt(m);
//		System.out.println(m);
		
		
		Integer ii=22;
		double dd=Double.valueOf(ii);
		System.out.println(dd);
				
		double d=ii.doubleValue();
		System.out.println(d);
	
		
		
		
		
		
		
		
		

	}

}
