package Sorting;
import java.util.Arrays;
public class SelectionSort {

	public static void main(String[] args) {
		int [] arr= {6,8,2,4,3,1};
		for(int i=0;i<arr.length;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min])
					min=j;
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		System.out.println("Ascending :"+Arrays.toString(arr));


		for(int i=0;i<arr.length;i++) {
			int max=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[max])
					max=j;
			}
			int temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;
		}
		System.out.println("Descending :"+Arrays.toString(arr));

	}

}
