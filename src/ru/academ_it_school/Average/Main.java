package ru.academ_it_school.Average;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Найти среднее арифметическое всех значений от a до b, когда a и b натуральные, a < b и a > 1.");
		Scanner scanner = new Scanner(System.in);

		String a = "";
		while ((a.length() == 0) || (!Average.checkInt(a)) || (Average.strToInt(a) < 2))
		{
			System.out.print("Введите число a > 1: ");
			a = scanner.nextLine();
		}
		System.out.println("Спасибо!");

		String b = "";
		while ((b.length() == 0) || (!Average.checkInt(b)) || (Average.strToInt(b) <= Average.strToInt(a)))
		{
			System.out.print("Введите число b (b > a): ");
			b = scanner.nextLine();
		}
		System.out.println("Спасибо!");

		System.out.println("Среднее арифметическое всех чисел от a до b равно: " + Average.getAverage(Average.strToInt(a), Average.strToInt(b)));
		System.out.println("Среднее арифметическое всех четных чисел от a до b равно: " + Average.getAverageEven(Average.strToInt(a), Average.strToInt(b)));
	}
}