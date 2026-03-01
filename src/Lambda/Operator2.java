package Lambda;
import java.util.function.*;

public class Operator2 {

	public static void main(String[] args) {
	int a=30;
	int b=20;
	
	BiConsumer<Integer,Integer> ad=(x,y)->System.out.println("Addition :"+(x+b));
	ad.accept(a, b);
	
	Supplier<Integer> su=()->a-b;
	System.out.println("Subtraction :"+su.get());
	
	BiFunction<Integer,Integer,Integer> mu=(x,y)->(x*y);
	System.out.println("Multiplication :"+mu.apply(a,b));
	
	BiPredicate<Integer, Integer> isFirstGreater = (x, y) -> x > y;

    System.out.println("Is First Number Greater? :" +isFirstGreater.test(a, b));

	}

}
