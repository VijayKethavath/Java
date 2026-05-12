package CollectionSet;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
	   
		TreeSet<Integer> ts = new TreeSet<>((a,b) ->b-a);
		
		ts.add(10);
		ts.add(30);
		ts.add(40);
		ts.add(40);
		ts.add(20);
		ts.add(20);
		
		System.out.println(ts);

		
		TreeSet<Character> set = new TreeSet<>();
		
		String str = "hello , vijay how are you ?";
		
		for(int i = 0; i<str.length();i++) {
			set.add(str.charAt(i));
		}
		System.out.println(set);
		
		for(Character ch:set) {
			System.out.print(ch);
		}
	}

}
