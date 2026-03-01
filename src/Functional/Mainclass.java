package Functional;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Mainclass {

	public static void main(String[] args) {

		Predicate<Integer> num= n->{
			
			if(n<=1) {
				return false;
			}
			for(Integer i=2;i<n;i++) {
				if(i%2==0) {
					return false;
				}
			}
			return true;
		};
		System.out.println(num.test(2));

		Consumer<Character> ch=c->{	
			//			int val=c;
			Boolean result=num.test((int)c);
			System.out.println(result);

		};
		ch.accept('A');
	}
}


