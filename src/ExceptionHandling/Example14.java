package ExceptionHandling;
//checked and unchecked
public class Example14 {
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
	 public void getage(int age) {
		 if(age<16) {
			 throw new RuntimeException(" age not allowed ");
			 
		 }
		 else 
			 System.out.println("age allowed");
	 }
		public static void main(String[] args) {
			try {
				new Example14().getdat(1);
				new Example14().getage(18);
			}catch(RuntimeException e) {
				e.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("end");
			

		}

	}
