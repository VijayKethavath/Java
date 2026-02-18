package Arrays;

public class Ex5 {

	public static void main(String[] args) {
		int[] arr= {5,15,25,35,45};
		
		for(int array:arr) {
			System.out.println(array);
		}
		
		short[] num=new short[4];
		
		num[0]=100;
		num[1]=200;
		num[2]=300;
		num[3]=400;
		
		for(int i=0;i<=num.length-1;i++) {
			System.out.println(num[i]);
		}

	}

}
