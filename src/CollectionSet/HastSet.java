package CollectionSet;

import java.util.HashSet;

public class HastSet {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		
		hs.add(10);
		hs.add(10);
		hs.add(30);
		hs.add(30);
		hs.add(20);
		
		System.out.println(hs);
		
		String str = "hello , how are you?";
		
		HashSet<Character> set = new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		System.out.println(set);
		

	}

}
