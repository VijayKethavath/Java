package nov04;

public class productData {

	public static void main(String[] args) {
		product1 obj =new product1();
		product1 obj1 =new product1();
		
		obj.setproductId(220);
		obj.productName="RC car";
		obj.price=899;
		obj.quantity=2;
		System.out.println(obj.displayData());
		System.out.println("________________________________________");
		
		obj1.productId=1002;
		obj1.productName="RC Drone";
		obj1.price=1999;
		obj1.quantity=2;
		System.out.println(obj1.displayData());
		
		

	}

}
