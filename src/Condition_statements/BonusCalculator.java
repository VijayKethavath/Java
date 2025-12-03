package Condition_statements;

public class BonusCalculator {
	public double calculateBonus(int experience, int rating, double salary) {
	 if(experience>5 && rating>9 )
		 return salary*0.50;
	 else if(experience<=5 && experience>3 &&  rating<=9 && rating>7 )
		 return salary*0.30;
	 else if(experience<=1 && experience>=3 &&  rating<=5 && rating>=7 )
		 return salary*0.10;
	 else
		 return salary*0;
	}

	public static void main(String[] args) {
		BonusCalculator obj =new BonusCalculator();
		System.out.println("bonus:"+obj.calculateBonus(6, 10, 30000));
		
	}

}
