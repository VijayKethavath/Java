package Program;
 import java.util.Scanner;
class Vehicle{
	private String OwnerName;
	private String VehicleNumber;
	private String VehicleType;

	public Vehicle(String OwnerName, String VehicleNumber, String VehicleType) {
		this.OwnerName = OwnerName;
		this.VehicleNumber = VehicleNumber;
		this.VehicleType = VehicleType;
	}
	public void Profile() {
		System.out.println("Owner Name:"+OwnerName);
		System.out.println("vehicle Number:"+VehicleNumber);
		System.out.println("Vehicle type:"+VehicleType);

}
}
class ServiceVehicle extends Vehicle{
	private String serviceCenterName;
	private String serviceCategory;

	public ServiceVehicle(String OwnerName, String VehicleNumber, String VehicleType, String serviceCenterName,
			String serviceCategory) {
		super(OwnerName, VehicleNumber, VehicleType);
		this.serviceCenterName = serviceCenterName;
		this.serviceCategory = serviceCategory;
		System.out.println("vehicle profile has been created.");
	}

	public void UpdateServicecenter(String newcenter){
		if(newcenter==null || newcenter=="") {
			System.out.println("Data not valid please Enter current data");
		}
		else {
			serviceCenterName=newcenter;
		}
	}
	public void UpdateServicecategory(String newcategory) {
		if(newcategory==null|| newcategory=="") {
			System.out.println("Data not valid please Enter current data");
		}
		else {
			serviceCategory=newcategory;
		}
	}
	public void VehicleProfile() {
		Profile();
		System.out.println("Service center:"+serviceCenterName);
		System.out.println("Service Category :"+serviceCategory);
	}

}


public class TransportCompany {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Owner Name:");
		String name=sc.nextLine();
		System.out.println("Enter vehicle Number:");
		String no=sc.nextLine();
		System.out.println("Enter vehicle type:");
		String type=sc.nextLine();
		System.out.println("Enter Service Center:");
		String center=sc.nextLine();
		System.out.println("Enter Category:");
		String cat=sc.nextLine();
		
		ServiceVehicle sv =new ServiceVehicle(name,no,type,center,cat);
		
		int opinion=0;
		boolean  status=true;
		while(status) {
			System.out.println("--- Menu ---\r\n"
					+ "1. Update Service Category\r\n"
					+ "2. Update Service Center\r\n"
					+ "3. View Profile\r\n"
					+ "4. Exit\r\n"
					+ "");
			System.out.println("Enter choice");
			opinion=sc.nextInt();
			sc.nextLine();
			switch(opinion) {
			
			case 1:{
				System.out.println("Enter service Category");
				String cate=sc.nextLine();
				sv.UpdateServicecategory(cate);
				break;
			}
			case 2:{
				System.out.println("Enter service Center");
				String cn=sc.nextLine();
				sv.UpdateServicecenter(cn);
				break;
			}
			case 3:{
				sv.VehicleProfile();
				break;
			}
			case 4:{
				System.out.println("Thank you");
				status=false;
				break;
			}
			default:{
				System.out.println("Invalid choice");
				
			}
			}
		}
		sc.close();
		
	}
		
	}


