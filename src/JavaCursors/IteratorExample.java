package JavaCursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			int value=it.next();
		    
			if(value==20) {
				it.remove();
			}
			
			System.out.println(value);
		}
		System.out.println("After Removal :"+list);
		
		

	}

}
