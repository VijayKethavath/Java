package Sorting;
import java.util.*;

public class Bubblesort {

	public static void main(String[] args) {
		int []arr= {4,5,8,3,1,2,};
		int n=arr.length-1;
		
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				if(arr[j]>arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Ascending :"+Arrays.toString(arr));
		
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				if(arr[j]<arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Descending :"+Arrays.toString(arr));
		
	}
}
