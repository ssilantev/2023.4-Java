package ru.academ_it_school.Person;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Type your name: ");
		String name = scanner.nextLine();

		System.out.print("Type your middle Name: ");
		String middleName = scanner.nextLine();

		System.out.print("Type your family Name: ");
		String familyName = scanner.nextLine();

		System.out.print("Enter your year of birth: ");
		int yearOfBirth = scanner.nextInt();

		Person person = new Person(name, middleName, familyName, yearOfBirth);

		System.out.print("\nRegistered client: " + person + ";\nClient age: " + Person.age(yearOfBirth) + ".\n");
	}
}