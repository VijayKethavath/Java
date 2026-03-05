package ExceptionHandling;
class InvaildAgeofBattery extends Exception{
	public InvaildAgeofBattery(String msg) {
		super(msg);
	}
}
class InvaildAgeofTyre extends Exception{
	public InvaildAgeofTyre(String msg) {
		super(msg);
	}
}
class InvaildAgeofEngine extends Exception{
	public InvaildAgeofEngine(String msg) {
		super(msg);
	}
}

class Vehicle{
	public void checkAge(int bry,int ty,int en) throws InvaildAgeofBattery , InvaildAgeofTyre, InvaildAgeofEngine{
		if(bry<2) {
			throw new InvaildAgeofBattery("Battery is out of Warranty");
		}
		else if(ty<10) {
			throw new  InvaildAgeofTyre("Tyre is out of Warranty");
		}
		else if(en<10) {
			throw new  InvaildAgeofEngine("Engine is out of Warranty");
		}
		else {
			System.out.println("vehicle is under Warranty");
		}
		
			
		}
	}

public class task {

	public static void main(String[] args) {
		Vehicle vh=new Vehicle();
		try {
			vh.checkAge(3,1,11);
		}
		catch( InvaildAgeofBattery e) {
			System.out.println(e.getMessage());
		}
		catch( InvaildAgeofTyre e) {
			System.out.println(e.getMessage());
		}
		catch( InvaildAgeofEngine e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("....Vehicle check Done....");
		}

	}
	

}
