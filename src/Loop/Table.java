package Loop;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a table you want to print:");
		int i=sc.nextInt();
		for (int j=1;j<=10;j++) {
			System.out.println(i+"*"+j+"="+i*j);
			sc.close();
		}
	}

}

