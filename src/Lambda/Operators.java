package Lambda;
interface ArithmeticOperation{
	int operator(int a,int b);
}
public class Operators {

	public static void main(String[] args) {
		ArithmeticOperation add =(a,b)->(a+b);
		ArithmeticOperation sub=(a,b)->(a-b);
		ArithmeticOperation mul=(a,b)->(a*b);
		ArithmeticOperation div=(a,b)->(a/b);
		
		System.out.println("Addition :"+add.operator(4, 2));
		System.out.println("Subtraction :"+sub.operator(4, 2));
		System.out.println("Multiplication :"+mul.operator(4, 2));
		System.out.println("Divison :"+div.operator(4, 2));

	}

}
