package ExceptionHandling;

class InvaildAgeException extends Exception{
	public InvaildAgeException(String message) {
		super(message);
	}
}

class Student{
	public void checkage(int age) throws InvaildAgeException{
		if(age<16) {
			throw new InvaildAgeException("Age not allowed");
		}
		else {
			System.out.println("Age allowed");
		}
	}
}

public class UserdefException {

	public static void main(String[] args) {
		try {
			new Student().checkage(18);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
