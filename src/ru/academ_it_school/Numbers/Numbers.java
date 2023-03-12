package ru.academ_it_school.Numbers;

public class Numbers {

	public static boolean checkInt(String s) {
		try {
			int tmp = Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.print("Value is not integer. ");
		}
		return false;
	}

	public static int strToInt(String a) {
		return Integer.parseInt(a);
	}

	public static int digitSum(String a) {
		int num = strToInt(a);
		int sum = 0;
		while (num > 0) {
			sum += (num % 10);
			num /= 10;
			}
		return sum;
	}

	public static int oddDigitSum(String a) {
		int numOdd = strToInt(a);
		int sumOdd = 0;
		while (numOdd > 0) {
			if (numOdd % 2 != 0){
				sumOdd += (numOdd % 10);
				}
			numOdd /= 10;
		}
		return sumOdd;
	}

	public static int maxDigit(String a) {
		int num = strToInt(a);
		int remainder;
		int max = 0;
		while (num > 0) {
			remainder = num % 10;
			if (remainder > max) {
				max = remainder;
			}
			num /= 10;
			}
		return max;
	}
}