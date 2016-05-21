package IncomeRateCalculator;

import IncomeRateCalculator.Person.Gender;

public class RateCalculator {

	public int calculateRateByIncome(int income) {

		switch (income > 0 ? (income > 200 ? (income > 500 ? (income > 1000 ? 4 : 3) : 2) : 1) : -1) {

		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 5;
		case 4:
			return 10;
		case -1:
			return 0;
		default:
			return 0;
		}

	}

	public int calculateRateByAge(int age) {

		switch (age > 0 ? (age > 18 ? (age > 25 ? (age > 60 ? 4 : 3) : 2) : 1) : -1) {
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 3;
		case 4:
			return 5;
		case -1:
			return 0;
		default:
			return 0;

		}

	}

	public int calculateRateByGender(String gender) {

		switch (gender) {
		case "boy":
			return 1;
		case "girl":
			return 2;

		default:
			return 0;

		}

	}

}
