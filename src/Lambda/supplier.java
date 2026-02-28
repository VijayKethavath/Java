package Lambda;
import java.util.function.Supplier;

public class supplier {

	public static void main(String[] args) {
		Supplier<String> s=()->"Hi there";
		 System.out.println(s.get());
			
	}

}
