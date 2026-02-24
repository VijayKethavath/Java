package Functional;

interface Numbercheck{
	boolean checkNumber(int num);
}
interface charcheck{
	void checkchar(char c);
}
public class main {
	
	public static boolean isprime(int number) {
		if(number<=1) {
			return false;
		}
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		Numbercheck checkprime=new Numbercheck() {
			public boolean checkNumber(int num) {
				boolean result=isprime(num);
				System.out.println(num+" is prime :"+result);
				return result;
			}
		};
		
		checkprime.checkNumber(7);
		
		charcheck charcheckar=new charcheck() {
			public void checkchar(char c) {
				int asciiValue = c;
				boolean result=isprime(asciiValue);
				System.out.println("ASCII value of : "+ asciiValue+" And is prime:"+result);
			}
		
		};
		charcheckar.checkchar('A');

	}

}
