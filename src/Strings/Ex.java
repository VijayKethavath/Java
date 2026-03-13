package Strings;

public class Ex {

	public static void main(String[] args) {
		String str="java";
		String str2=" awesome";
		
		str.concat(str2);
		System.out.println(str);
		
		StringBuilder  str3=new StringBuilder("Java");
		str3.append(str2);
		System.out.println(str3);
		

	}

}
