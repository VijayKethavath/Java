package ExceptionHandling;
//unchecked (runtime)
class Num{
	public void isNum(int num) throws RuntimeException{
		if(num<=0) {
			throw new RuntimeException();
		}
		else {
			System.out.println(num);
		}
	}
}
public class Example12 {

	public static void main(String[] args) {
		try {
			new Num().isNum(0);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
