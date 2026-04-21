package Collection;
import java.util.*;

public class Rawtype {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(12.20);
		a.add("Hello");
		System.out.println(a);
		
		System.out.println((int)a.get(0));
		System.out.println((double)a.get(1));
		System.out.println((String)a.get(2));

	}

}
