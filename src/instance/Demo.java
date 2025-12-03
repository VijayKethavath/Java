package instance;


public class Demo { 
	byte a=2;
	public byte getbytevalue () {
	return a;
	}
	
	public static void main(String[] args) {
		Demo obj=new Demo();
		byte value=obj.getbytevalue();
		System.out.println(value);
		
		
   }
}








