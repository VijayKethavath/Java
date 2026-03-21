package _2DArray;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		int rows=4;
		int cols=3;
		int [][] arr=new int [rows][cols];
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
//			System.out.println(Arrays.toString(arr[i]));
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
