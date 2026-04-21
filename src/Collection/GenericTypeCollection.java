package Collection;

import java.util.ArrayList;

public class GenericTypeCollection {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Deva");
		list.add("Devi");
		list.add("Ajay");
		
		System.out.println("Name list");
		for(String str:list) System.out.println(str);
		
		System.out.println("\nString length");
		for(String str:list) System.out.println(str+"->"+str.length());
		
		ArrayList<student> std=new ArrayList<>();
	    std.add(new student(1,"Vijay"));
	    std.add(new student(2,"Akshitha"));
	    
	    System.out.println("\nStudent Details..");
	    for(student s:std) System.out.println("ID: "+s.id+", Name: "+s.name);  
	}

}

class student{
	int id;
	String name;
	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
}
