package nov04;

public class Product {
	String productName;
	int productId;
	int productprice;
	public void addproductDetails(String name,int id,int price) {
		productName=name;
		productId=id;
		productprice=price;
		
	}
	public String displayDetails() {
		return "Product Name: "+productName+"\n"+"Product Id: "+productId+"\n"+"Product Price: "+productprice;
	}
	
	public static void main(String[] args) {
	Product obj=new Product();
	obj.addproductDetails("PlayStation 5",2210,55000);
	System.out.println(obj.displayDetails());
	

	}

}
