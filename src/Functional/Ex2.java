package Functional;
import java.util.function.Predicate;

public class Ex2 {

	public static void main(String[] args) {
		Predicate<Integer> p=new Predicate<Integer>() {
			public boolean test(Integer n) {
				return n%2==0;
			}
			
		};
		System.out.println("iseven :" +p.test(4));

	}

}
