package instance;

public class demo2 {
    short a=22;
    public short getshortvalue() {
    return a;
    }

	public static void main(String[] args) {
		demo2 obj=new demo2();
		short value=obj.getshortvalue();
		System.out.println(value);

	}

}
