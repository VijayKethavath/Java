package nov04;

public class carrenatal {
	int carId;
	String brand;
	String model;
	double rentalpriceperday;
	public int getcarId() {
		return carId;
	}
	public String getbrand() {
		return brand;
	}
	public String getmodel() {
		return model;
	}
	public double getrentalpriceperday() {
		return rentalpriceperday;
	}
	public void setcardId(int Id) {
	    carId=Id;
	}
	public void setbrand(String br) {
		brand=br;
	}
	public void setmodel(String md) {
		model=md;
	}
	public void setrentalpriceperday(double day) {
		rentalpriceperday=day;
		
	}
	public String displayData() {
		return brand;
	}

}
