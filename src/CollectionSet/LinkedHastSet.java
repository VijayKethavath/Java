package CollectionSet;

import java.util.LinkedHashSet;

public class LinkedHastSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> ls = new LinkedHashSet<>();
		
		ls.add(10);
		ls.add(10);
		ls.add(30);
		ls.add(30);
		ls.add(20);
		
		System.out.println(ls);
		
		String str = "hello ,how are you?";
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(int i = 0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		
		System.out.println(set);
		
		for(Character ch:set) {
			System.out.print(ch);
		}
		
		
		
		

	}

}
