package Sorting;
import java.util.Arrays;

public class Selection1 {

	public static void main(String[] args) {
	int[] arr= {2,5,1,3,4};
	
	for(int i=0;i<arr.length;i++) {
		int min=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[min]>arr[j]) {
				min=j;
				}
		}
		
		System.out.print(i+" Iteration => "+Arrays.toString(arr)+" -> ");
		
		int temp =arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
		
		System.out.println(Arrays.toString(arr));
		
	}
	System.out.println("\nSelection Sort :"+Arrays.toString(arr));
	

	}

}
