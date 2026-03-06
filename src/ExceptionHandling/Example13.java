package ExceptionHandling;
//checked (compile time)
public class Example13 {
 public void getdat(int num) throws Exception{
	 if(num==0) {
		 throw new Exception("Zreo not allowed");
	 }else if(num<0) {
		 throw new Exception("negative are not allowed");
	 }
	 else {
		 System.out.println(num);
	 }
 }
	public static void main(String[] args) {
		try {
			new Example13().getdat(-5);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");
		

	}

}
