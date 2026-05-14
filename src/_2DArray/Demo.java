package _2DArray;

import java.util.Arrays;


public class Demo {

	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
//		
		int [][] tr=new int[3][3];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				tr[j][i]=arr[i][j];
			}
		}
			
			for(int i=0;i<tr.length;i++) {
				for(int j=0;j<tr[0].length;j++) {
					System.out.print(tr[i][j]+" ");
				}
				System.out.println("");
				
			}
////				if(i == 0 || j==0 || i==arr.length-1 || j==arr[0].length-1) {  
////					  System.out.println(arr[i][j]+"");
//		
////		
////		int [] arr= {1,0,3,0,4,5,7,0};
////		
////		int index =0;
////		
////		for(int i=0;i<arr.length;i++) {
////			if(arr[i]!=0) {
////				arr[index]=arr[i];
////				index++;
////			}
////		}
////		while(index<arr.length) {
////			arr[index]=0;
////			index++;
////		}
////		System.out.println(Arrays.toString(arr));
//		
//		int a=3;
//		int b=5;
//		
//		
//		
//		System.out.println(a+" "+b);
//				
			
			
		
		

	}

}
