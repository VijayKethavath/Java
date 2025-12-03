package nov04;


public class product1 {
	int productId;
	String productName;
	double price;
	int quantity;
	public int getproductId() {
		return productId;
	}
	public String getproductName() {
		return productName;

	}
	public double getprice() {
		return price;
	}
	public int getquantity() {
		return quantity;

	}
	public void setproductId(int Id) {
		productId=Id;


	}
	public void setproductName(String name) {
		productName=name;
	}
	public void setprice(double pr) {
		price=pr;
	}
	public void setquantity(int qu) {
		quantity=qu;
	}
	public String displayData() {
		return "product Id :"+productId+"\nProduct Name :"+productName+"\nprice :"+price+"\nquantity :"+quantity;

	}
}
