package Lambda;
import java.util.function.Consumer;

public class consumer {

	public static void main(String[] args) {
		Consumer<String> c=name->System.out.println("Hello "+name);
		c.accept("Daddy i miss you so much");

	}

}
