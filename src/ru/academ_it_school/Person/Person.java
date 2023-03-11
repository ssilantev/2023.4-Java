package ru.academ_it_school.Person;

import java.time.YearMonth;

public class Person {
	private String name;
	private String middleName;
	private String familyName;
	private int yearOfBirth;

	public Person(String name, String middleName, String familyName, int yearOfBirth) {
		this.name = name;
		this.middleName = middleName;
		this.familyName = familyName;
		this.yearOfBirth = yearOfBirth;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getYarOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public static int age(int yearOfBirth) {
		return YearMonth.now().getYear() - yearOfBirth;
	}

	@Override
	public String toString() {
		return familyName + " " + name + " " + middleName;
	}
}