package Strings;

public class Example {

	public static void main(String[] args) {
		String str="ABCDEFGH";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				String st=str.substring(i,j);
				System.out.println(st);
				
			}
			System.out.println("");
		}
				

	}

}
