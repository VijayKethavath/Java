package Lambda;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class prime {

	public static  boolean isprime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%2==0) {
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		
	 Predicate<Integer> pr=number->isprime(number);
	 System.out.println(pr.test(2)?"Prime":"Not prime");
	 
	 Consumer<Character> ch=c->System.out.println(isprime(c)?"Prime":"Not prime");
	 ch.accept('A');
	 
//	 Consumer<Character> ch1=new Consumer<Character>() {
//	 public void accept(Character c) {
//		 boolean res=isprime(c);
//		 System.out.println(res?"prime":"not prime");
//	 }
// };
// ch1.accept('A');

	 

	}

}
