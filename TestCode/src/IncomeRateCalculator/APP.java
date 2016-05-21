package IncomeRateCalculator;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import IncomeRateCalculator.Person.Gender;

public class APP {
	
	
	public static void main(String[] args){
			
		
		
		
		
		
		
		Person p1=new Person("Mike",25,500,Gender.Male);
		Person p2=new Person("Derek",24,1000,Gender.Male);
		Person p3=new Person("Cathy",23,2000,Gender.Female);
		
		Set<Person> personSet=new HashSet<Person>();
		
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(new Person("Jero",60,15000,Gender.Male));
		
		
		Calculator c=new Calculator();
		
		for(Person p:personSet){
			int finalRate=c.calculate(p);
			System.out.println("Name: "+p.getName()+" Age: "+p.getAge()+" Gender: "+p.getGender()+" Rate: "+finalRate);
		}
		
		
		
	}
		
	
}
