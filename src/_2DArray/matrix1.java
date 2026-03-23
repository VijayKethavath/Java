package _2DArray;
import java.util.Scanner;

public class matrix1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows:");
		int row=sc.nextInt();

		System.out.println("Enter Column: ");
		int col=sc.nextInt();

		int [][]arr=new int[row][col];

		System.out.println("Enter Matrix Elements :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("Matrix Elements  are:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}

			System.out.println();
		}
		System.out.println("");

		//Transpose Matrix
		System.out.println("Transpose Matrix :");
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(arr[j][i]+" ");
			}

			System.out.println();
		}
		System.out.println("");


		//Find Largest Number in Matrix
		int large=arr[0][0];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(arr[i][j]>large) {
					large=arr[i][j];
				}
			}
		}
		System.out.println("Largest Number is :"+large);
		System.out.println("");
		

		//Row Sum and Column Sum
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum=sum+arr[i][j];
			}
			System.out.println("Row "+i+" sum: "+sum);
		}

    	for(int i=0;i<col;i++) {
			int sum=0;
			for(int j=0;j<row;j++) {
				sum=sum+arr[j][i];
			}
			System.out.println("Column "+i+" sum: "+sum);
		}

		sc.close();
	}

}
