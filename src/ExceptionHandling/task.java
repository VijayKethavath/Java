package ExceptionHandling;
class InvaildBatteryException extends Exception{
	InvalidBatteryException(String message){
		super(message);
	}
}
class InvaildtyreException extends Exception{
	InvalidtyreException(String message){
		super(message);
	}
}
class InvaildEngineException extends Exception{
	InvaildEngineException(String message){
		super(message);
	}
}
class vehicle {
	void checkvehicle(int bat,int ty,int En) throws InvaildBatteryException,InvaildtyreException, InvaildEngineException{
		if(bat<2) {
			throw new InvaildBatteryException("Not valid");
		}
		else if(ty<5) {
			throw new  InvaildtyreException("not valid");
			
		}
		else if(En<4) {
			throw new InvaildEngineExpception("not vaild");
		}
	}
}

public class task {

	public static void main(String[] args) {
		vehicle vh =new vehicle();
		try {
			vh.checkvehicle(1,2,4);
		}
		catch(InvaildBatteryException e){
			System.out.println(e);
			
		}
		catch(InvaildtyreException e){
			System.out.println(e);
			
		}
		catch(InvaildEngineException e){
			System.out.println(e);
			
		}

	}

}
