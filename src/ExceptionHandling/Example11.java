package ExceptionHandling;

class Number{
	public void Isnum(int num) {
		if(num<=0) {
			throw new RuntimeException();
		}
		else {
			System.out.println(num);
		}
	}
}

public class Example11 {

	public static void main(String[] args) {
		new Number().Isnum(0);

	}

}
