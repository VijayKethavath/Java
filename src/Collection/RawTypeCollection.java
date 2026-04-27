package Collection;
import java.util.ArrayList;

public class RawTypeCollection {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Vijay");
		list.add(22);
		list.add("10/12/2003");
		list.add(true);

		System.out.println("Raw type Elements :");
		for(Object obj:list) {
			System.out.println(obj);
		}
		System.out.println("\nTrying to process elements...");

		try {
			// Assuming all elements are String 
			for(int i=0;i<list.size();i++) {
				String name=(String)list.get(i);
				System.out.println(name);
				System.out.println("length "+list.size());
			}
		}catch(Exception e) {
			System.err.println("Error Occurred :"+e);
		}
		list.add("Java");
		list.add(1000);

		System.out.println("\nMixed Data processing...");
		for(Object obj:list) {
			if(obj instanceof Integer) System.out.println("Integer: "+obj);
			else if(obj instanceof String) System.out.println("String:"+ obj);
			else System.out.println("Other type:" +obj);
		}
	}

}
