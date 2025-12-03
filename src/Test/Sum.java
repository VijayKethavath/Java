package Test;

public class Sum {
	public void setno(int no) {
		int num=no;
		int sum=0;
		while(num!=0) {
			int reminder=num%10;  //1 0 1
			sum=sum+reminder;     //1 0 1
			num /=10;            //10 1 0
		}
		System.out.println(sum);
	}


	public static void main(String[] args) {
		new Sum().setno(101);
		new Sum().setno(567);
	}
}
