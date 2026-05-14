package emuns;

enum Day1{
	MONDAY,
	TUESDAY,
	WEDNESDAY
}

public class Days{
	public static void main(String[] args) {
		Day1 d=Day1.MONDAY;
		System.out.println(d);
		System.out.println(d.ordinal());
		System.out.println(Day1.TUESDAY.ordinal());
	}
	
}
