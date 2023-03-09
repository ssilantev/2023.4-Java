package ru.academ_it_school.For;

public class Main {
	public static boolean divisibleByFour(int i) {
		return i % 4 == 0;
	}
	public static void main(String[] args) {

		for (int i = 100; i >= 1; i --) {
			if (divisibleByFour(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
