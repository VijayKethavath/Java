package Wrapper;

public class Manual1 {

	public static void main(String[] args) {
		short s=10;
		int i=100;
		double d=20.0;
		char c='v';
		boolean b=true;
		
		System.out.println("Manual Boxing Primitive to Non Primitive");
		
		Short ss=Short.valueOf(s);         // 
		Integer ii=Integer.valueOf(i);
		Double dd=Double.valueOf(d);
		Character cc=Character.valueOf(c);
		Boolean bb=Boolean.valueOf(b);
		
		System.out.println(ss);
		System.out.println(ii);
		System.out.println(dd);
		System.out.println(cc);
		System.out.println(bb);
		
		
		System.out.println("Manual UnBoxing Primitive to Non Primitive");
		
		Integer a=10;
		
		int aa=a.intValue();
		System.out.println(aa);
		
		int aaa=Integer.valueOf(a);
		System.out.println(aaa);
		
		Double x=20.0;
		
		double u=x.doubleValue();
		System.out.println(u);
		
		
		
		
		
		
		
		
		
		
				
		

	}

}
