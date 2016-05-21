package Pratices;

public class DayOfMonthApp {

	public static void main(String[] args) {
		DayOfMonth Feb=DayOfMonth.Feb;
		
		String str= Feb.getDes();
		
		System.out.println(Feb.getDays());
		System.out.println(Feb.getDes());
		System.out.println(str);
		
		
		boolean compareEnumObject;
		
		compareEnumObject=DayOfMonth.April.equals(Feb);
		System.out.println(compareEnumObject);
	}

}
