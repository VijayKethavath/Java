package CollectionSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class demo {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(10);
		set.add(20);
		
		Integer n=1;
		System.out.println(n.hashCode());
		
		System.out.println(set);
		
		String s="Hello";
		
		System.out.println(s.hashCode());
		
		TreeSet<String> st = new TreeSet<>();
		
		st.add("a");
		st.add("c");
		st.add("b");
		
		System.out.println(st);
		
		
		
		
		
	}

}
