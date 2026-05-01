package JavaCursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
	 
		ArrayList<Integer> list =  new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		ListIterator<Integer> itr = list.listIterator();
		
		while(itr.hasNext()) {
			int value=itr.next();
			
			if(value == 20) {
				itr.set(25);
				itr.add(28);
			}
		}
			while(itr.hasPrevious()) {
				System.out.println(itr.previous());
				
			}
			
			System.out.println("Final List :"+list);
			

	}

}
