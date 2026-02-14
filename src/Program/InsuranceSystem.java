package Program;
import java.util.Scanner;
class InsuracePolicy{
	private String customerName;
	private String policyType;
	private double policyAmount;
	private double approvedAmount;
	private String policyStatus;
	public InsuracePolicy(String customerName, String policyType, double policyAmount)
	{
		this.customerName = customerName;
		this.policyType = policyType;
		if(policyAmount>0) {
			this.policyAmount=policyAmount;
		}
		else {
			this.policyAmount=0;
			System.out.println("policy amount is not valid set to 0");

		}
		this.approvedAmount=0;
		this.policyStatus="Pending";
		System.out.println("Policy Profile Created");
	}
	public InsuracePolicy(String customerName, String policyType, double policyAmount, double approvedAmount,
			String policyStatus) {
		this.customerName = customerName;
		this.policyType = policyType;
		if(policyAmount>0) {
			this.policyAmount=policyAmount;
		}
		if(approvedAmount>0&&approvedAmount<=policyAmount) {
			this.policyAmount=policyAmount;
		}
		this.policyStatus=policyStatus;
		System.out.println("Policy Profile Created");	
	}
	public void UpdateApprovedAmount(double amount) {
		if(amount>0&&amount<=policyAmount) {
			policyAmount=amount;
			System.out.println("Update Approved Amount Successfull");
		}
		else {
			System.out.println("invalid Approved Amount ");
		}
	}
	public void ChangePolicyStatus(String status) {
		if(status!=null && !status.equals("")){
			policyStatus=status;
			System.out.println("Change Policy Status successfull");
		}
		else {
			System.out.println("Change Policy Status invalid");
		}
	}
	public void ViewPolicySummary() {
		System.out.println("Customer: "+customerName);
		System.out.println("Policy Type: "+policyType);
		System.out.println("Policy Amount: "+policyAmount);
		System.out.println("Approved Amount: "+approvedAmount);
		System.out.println("Policy Status: "+policyStatus);
	}


}
public class InsuranceSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name:");
		String name=sc.nextLine();
		System.out.println("Enter Policy Type: ");
		String type=sc.nextLine();
		System.out.println("Enter Policy Amount: ");
		int amt=sc.nextInt();

		InsuracePolicy ip=new InsuracePolicy(name,type,amt);

		int opinion=0;
		boolean statu=true;
		while(statu) {
			System.out.println("--- Menu ---\r\n"
					+ "1. Update Approved Amount\r\n"
					+ "2. Change Policy Status\r\n"
					+ "3. View Summary\r\n"
					+ "4. Exit\r\n"
					+ "");
			opinion=sc.nextInt();
			switch(opinion) {

			case 1:{
				System.out.println("Enter Approved Amount");
				double amont=sc.nextDouble();
				ip.UpdateApprovedAmount(amont);
				break;
			}
			case 2:{
				sc.nextLine();
				System.out.println("Enter polict status");
				String satus=sc.nextLine();
				ip.ChangePolicyStatus(satus);
				break;
				
			}
			case 3:{
				ip.ViewPolicySummary();
				break;
			}
			case 4:{
				System.out.println("Thank you");
				statu=false;
			}
			default:{
				System.out.println("Invalid input");
			}
			}

		}
		sc.close();



	}


}
