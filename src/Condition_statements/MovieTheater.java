package Condition_statements;

public class MovieTheater {
	public double getTicketPrice(int age) {
		if(age<5)
			return 0.0;
		else if(age<=12 && age>=5)
			return 5.0;
		else if(age<=60&&age>=13)
			return 10.0;
		else
			return 5.0;
	}
	public static void main(String[] args) {
		MovieTheater obj=new MovieTheater();
		System.out.println("Ticket price is $"+obj.getTicketPrice(21));

	}

}
