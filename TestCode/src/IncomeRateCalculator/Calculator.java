package IncomeRateCalculator;

public class Calculator {
	
	int personIncome;
	int personAge;
	String gender;
	
	int incomeRateByIncome;
	
	int incomeRateByAge;
	int incomeRateByGender;
	
	public int calculate(Person p){
		
		RateCalculator incomeRateCalculator=new RateCalculator();
		
		
		
		
		if(p!=null){
			personIncome=p.getIncome();
			personAge=p.getAge();
			gender=p.getGender();
			
			incomeRateByIncome=incomeRateCalculator.calculateRateByIncome(personIncome);
			incomeRateByGender=incomeRateCalculator.calculateRateByGender(gender);
			incomeRateByAge=incomeRateCalculator.calculateRateByAge(personAge);
			
			
		}
		
		return this.calculateTotal();
	}
	
	
	
	public int calculateTotal(){
		
		
		
		return incomeRateByIncome*incomeRateByGender*incomeRateByAge;
	}
}
