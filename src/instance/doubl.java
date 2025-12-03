package instance;

public class doubl {
	double a=1.523;
	public double getdoublevalue() {
		return a;
	}

	public static void main(String[] args) {
		doubl obj=new doubl();
		double value=obj.getdoublevalue();
		System.out.println(value);

	}

}
