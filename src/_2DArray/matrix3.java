package _2DArray;

public class matrix3 {
 public static void main(String[] args) {
		int [][]a= {{1,2,3},{1,2,3},{1,2,3}};
		int [][]b= {{1,2,3},{1,2,3},{1,2,3}};
			
		int row=a.length;
		int col=a[0].length;
		
		int [][]c=new int[row][col];
		
		if(row==b.length && col==b[0].length) {
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					c[i][j]=a[i][j]+b[i][j];		
				}
			}
			System.out.println("Matrix Addtion:");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print(c[i][j]+" ");		
				}
				System.out.println();
			}	
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					c[i][j]=a[i][j]*b[i][j];		
				}
			}
			System.out.println("Matrix Multiplication:");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print(c[i][j]+" ");	
				}
				System.out.println();
			}
		}else {
			System.out.println("Addition and multiplication not possible");
		}
		

	}

}
