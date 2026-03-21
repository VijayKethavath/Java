package _2DArray;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows :");
		int row=sc.nextInt();
		System.err.println("Enter columns :");
		int cols=sc.nextInt();
		int [][]arr=new int[row][cols];
	
		System.out.println("Enter matrix Elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix is :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			}
		
		sc.close();

	}

}
