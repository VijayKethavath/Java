package instance;

public class Mobile {
	static String storename;
	String mobilebrand;
	int price;
	public void showDetails() {
		System.out.println("store Name:"+storename);
		System.out.println("mobile brand:"+mobilebrand);
		System.out.println("price"+price);
		System.out.println("-------------------------------------------");
	}
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		Mobile m2=new Mobile();
		m1.storename="vijay sale's";
		m1.mobilebrand="apple";
		m1.price=8000;
		m1.showDetails();
		m2.mobilebrand="samsung";
		m2.price=8500;
		m2.showDetails();		
		
	}

}
