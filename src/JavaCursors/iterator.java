package JavaCursors;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		ArrayList<Student> list= new ArrayList<>();
		
		list.add(new Student(1,"Devi",85));
		list.add(new Student(2,"Deva",75));
		list.add(new Student(3,"Snoopy",48));
		list.add(new Student(4,"Vijay",45));
		
		Iterator<Student> it = list.iterator();
		System.out.println("All Students List:");
		while(it.hasNext()) {
			Student s1 = it.next();
			System.out.println(s1.id+" "+ s1.name+" "+s1.marks);
			
			if(s1.marks<50) {
				it.remove();
			}
		}
		
		System.out.println("\nPassed Student:");
        for(Student s1:list) {
        	System.out.println(s1.id+" "+ s1.name+" "+s1.marks);
        }
	}

}
