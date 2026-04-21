package Collection;

import java.util.*;

public class GenericType {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<>();
		str.add("Fruits");
		str.add("Apple");
		str.add("Banana");
		str.add("Cherry");
		str.add("Mango \n");
		
		System.out.println(str.size());
		
		System.out.println(str.get(0)+"\n");
		
		for(String name:str) {
			System.out.println(name);
		}
	
		for(int i=1;i<str.size();i++) {
			System.out.println(i+"."+str.get(i));
		}

	}

}
