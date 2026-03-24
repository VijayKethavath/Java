package _2DArray;
import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows :");
		int row=sc.nextInt();
		
		System.out.println("Enter columns :");
		int col=sc.nextInt();
		
		int [][]a=new int [row][col];
		int [][]b=new int [row][col];
		int [][]c=new int [row][col];
		
		System.out.println("Enter Matrix A Elements :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter Matrix B Elements :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix A Elements are :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix B Elements are :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}}
		
		System.out.println("Matrix Addition Result :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix Daigonal :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j)
				System.out.print(c[i][j]+" ");
			}
			
		}
		
		System.out.println("");
		System.out.println("Matrix Anti Daigonal :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i+j==row-1)
					System.out.print(c[i][j]+" ");
			}
			
		}
		sc.close();
		

	}

}
