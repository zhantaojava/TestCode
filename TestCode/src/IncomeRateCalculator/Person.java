package IncomeRateCalculator;

public class Person {
	private String name;
	private int age;
	private int income;
	private Gender gender;
	
	
	
	public enum Gender{
		Male("boy"),
		Female("girl");
		
		private String gender;
	
		 Gender(String gender){
			this.gender=gender;
		}
		 
		 public String getGender(){
			 return gender;
		 }
	}
	
	
	

	public Person(String name, int age, int income,Gender gender) {
		super();
		this.gender=gender;
		this.name = name;
		this.age = age;
		this.income = income;
	}
	
	public String getGender(){
		return gender.getGender();
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}
}
