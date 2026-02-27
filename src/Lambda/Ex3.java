package Lambda;
import java.util.function.Predicate;

public class Ex3 {

	public static void main(String[] args) {
		Predicate<Integer> p=n->n%2==0;
		System.out.println(p.test(4));
		
		Predicate<Double> pr=n->{
			return n%2==0;
		};
		System.out.println(pr.test(6.0));

	}

}
