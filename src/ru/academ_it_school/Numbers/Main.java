package ru.academ_it_school.Numbers;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter an integer greater than 0.");
		Scanner scanner = new Scanner(System.in);

		String a = "";
		while ((a.length() == 0) || (!Numbers.checkInt(a)) || (Numbers.strToInt(a) < 1)) {
			System.out.print("Your value is: ");
			a = scanner.nextLine();
		}
		System.out.println("The value is really an integer!\n");

		System.out.println("The sum of the digits of " + a + " is: " + Numbers.digitSum(a) + ".");

		System.out.println("The sum of only the odd digits of " + a + " is: " + Numbers.oddDigitSum(a) + ".");

		System.out.println("The greatest digit of " + a + " is: " + Numbers.maxDigit(a) + ".");
	}
}
