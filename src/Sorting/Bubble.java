package Sorting;
import java.util.*;

public class Bubble {

	public static void main(String[] args) {
		int [] arr= {7,8,5,4,1,6,2};
		int n=arr.length-1;
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				if(arr[j]>arr[j+1]) {
//					System.out.print(Arrays.toString(arr)+"->");
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					System.out.println(Arrays.toString(arr)+"->");
					
					
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
