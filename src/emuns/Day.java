package emuns;

enum day{
	MONDAY,
	TUESDAY,
	WEDNESDAy
}

public class Day {

	public static void main(String[] args) {
		day d = day.WEDNESDAy;
		
		switch(d) {
		case MONDAY: System.out.println("today is Monday"); break;
		case TUESDAY: System.out.println("TOday is TUesday"); break;
		case WEDNESDAy:System.out.println("Today is Wednesday"); break;
		}

	}

}
