package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size=Integer.parseInt(sc.nextLine());
		if(size<=0 || size>=10) {
			System.out.println("Invalid size");
			sc.close();
		}
		else {
			String []arr=new String[size];
			for(int i=0;i<size;i++) {
			System.out.println("Enter "+i+" index value :");
			String ele=sc.nextLine();
			arr[i]=ele;
			}
			System.out.println(Arrays.toString(arr));
			sc.close();
		}
		

	}

}
