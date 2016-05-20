import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class SumofIntegers {

	public static void main(String[] args) {
		LinkedList<Integer> hsint = new LinkedList<>();

		try {
			printResult(readTheInteger(hsint));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void printResult(LinkedList<Integer> hsint) {
		int sumOfOdds = 0;
		int sumOfEvens = 0;

		for (Iterator<Integer> items = hsint.iterator(); items.hasNext();) {
			int item = (int) items.next();
			if (item % 2 == 0) {
				sumOfEvens += item;
			} else {
				sumOfOdds += item;
			}
		}
		System.out.println("The sum of odds is " + sumOfOdds);
		System.out.println("The sum of even is " + sumOfEvens);

	}

	private static LinkedList<Integer> readTheInteger(LinkedList<Integer> hsint) {

		System.out.println("Please enter ten integers!");

		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				String string = sc.nextLine();
				if (string.equals(""))
					break;
				hsint.add(Integer.valueOf(string));
			}

			sc.close();
		} catch (Exception e) {
			System.out.println("Please enter integer only");
			e.printStackTrace();
		}
		return hsint;
	}

}