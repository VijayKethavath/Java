package Functional;
import java.util.function.Predicate;

public class task1 {

	public static void main(String[] args) {
		Predicate<Integer> num=new Predicate<Integer>(){
			
			public boolean test(Integer n) {
				if(n<=1) {
					return false;
				}
				for(int i=2;i<n;i++) {
					if(n%i==0) {
						return false;
					}
					
				}
				return true;
			}
			
		};
		
		int number=7;
		System.out.println(num.test(number));

	}

}
