package Sorting;
import java.util.*;

public class Selection {

	public static void main(String[] args) {
	int [] arr= {5,8,6,2,1};
	for(int i=0;i<arr.length;i++) {
		int min=i;//0->5
		for(int j=i+1;j<arr.length;j++) { //1->8
			if(arr[j]<arr[min])//8  5
				min=j;//5->1
		}
		System.out.println("Iteration "+i);
		System.out.print(Arrays.toString(arr)+"->");
		
		
		int temp=arr[i];    //5->5
		arr[i]=arr[min];    //5->1
		arr[min]=temp;      //1->5
		System.out.println(Arrays.toString(arr)+"\n");
	}
	System.out.println(Arrays.toString(arr));
	
	

	}

}
