package demo;

public class CurrencyConvertervaribale {
	static double  dollarRate = 84.5;
	
	public static void  convertToINR(double usd) {
		double d=dollarRate*usd;
		System.out.println(usd+" converted into INR ="+d);
	}

	public static void main(String[] args) {
		convertToINR(2);
		convertToINR(20);
		convertToINR(200);
		

	}

}
