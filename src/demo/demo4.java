package demo;



public class demo4 {
    long  a=123456678;
    public long getlongvalue() {
    	return a;
    }
    
	public static void main(String[] args) {
		demo4 obj=new demo4();
		long value=obj.getlongvalue();
		System.out.println(value);

	}

}
