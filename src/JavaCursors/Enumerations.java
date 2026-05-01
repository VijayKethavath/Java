package JavaCursors;

import java.util.*;

public class Enumerations {

	public static void main(String[] args) {
		Vector<Student> std= new Vector<>();
		
		std.add(new Student(1,"Devi",85));
		std.add(new Student(2,"Deva",75));
		std.add(new Student(3,"Snoopy",85));
		
		Enumeration<Student> e = std.elements();
		
		System.out.println("Student list :");
		while(e.hasMoreElements()) {
			Student s=e.nextElement();
			System.out.println(s.id+", "+s.name+", "+s.marks);
		}
		
		
		

	}

}
