package Condition_statements;

public class LoanApproval {
	public String checkLoanApproval(double salary, int creditScore) {
		if((salary>=80000)&&(creditScore>=750)) {
			return "Approved Immediately";
		}
		else if((salary<80000)&&(salary>=50000)&&(creditScore<750)&&(creditScore>=650)) {
			return "Loan Approved with Higher Interest Rate" ;
		}
		else {
			return "Co-signer Required";
		}
	}

			public static void main(String[] args) {
				LoanApproval obj=new LoanApproval();
				System.out.println(obj.checkLoanApproval(65000, 700));

	}

}
