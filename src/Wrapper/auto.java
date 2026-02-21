package Wrapper;

public class auto {

	public static void main(String[] args) {
		short s=10;
		int i=100;
		double d=20.0;
		
		System.out.println("Auto Boxing Primitive to Non Primitive");
		Short ss=s;
		Integer ii=i;
		Double dd=d;
		
		System.out.println(ss);
		System.out.println(ii);
		System.out.println(dd);
		
		System.out.println("Auto unBoxing Primitive to Non Primitive");
		
		Integer z=40;
		int zz=z;
		System.out.println(zz);
		
		
		String str="50";
		int num=40;
		System.out.println(str+num);
		
		int num1=Integer.valueOf(str);
		System.out.println(num+num1);
		
		int num2=Integer.parseInt(str);
		System.out.println(num+num2);
		
		
		
		
		
		
		

	}

}
