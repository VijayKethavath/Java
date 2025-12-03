package instance;

public class character {
	char a='v';
	public char getcharvalue() {
		return a;
	}

	public static void main(String[] args) {
		character obj=new character();
		char value=obj.getcharvalue();
		System.out.println(value);

	}
}
