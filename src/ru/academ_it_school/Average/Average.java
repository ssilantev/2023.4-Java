package ru.academ_it_school.Average;

public class Average {

	public static boolean checkInt(String s) {
		try {
			int tmp = Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.print("Неверный тип данных. ");
		}
		return false;
	}

	public static int strToInt(String s) {
			return Integer.parseInt(s);
	}

	public static double getAverage(int aInt, int bInt) {

		int m = 0;
		double sum = 0.0;
		while (aInt <= bInt) {
			sum = sum + aInt;
			m++;
			aInt++;
		}
		return (sum / m);
	}

	public static double getAverageEven(int aInt, int bInt) {

		int n = 0;
		double sumE = 0.0;
		while (aInt <= bInt) {
			if (aInt % 2 == 0) {
				sumE = sumE + aInt;
				}
			n++;
			aInt++;
		}
		return (sumE / n);
	}
}