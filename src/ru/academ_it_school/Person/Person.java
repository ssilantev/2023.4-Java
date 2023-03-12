package ru.academ_it_school.Person;

import java.time.YearMonth;

public class Person {
	private String name;
	private String middleName;
	private String familyName;
	private int age;

	public Person(String name, String middleName, String familyName, int age) {
		this.name = name;
		this.middleName = middleName;
		this.familyName = familyName;
		this.age = age;
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

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static int yearOfBirth(int age) {
		return YearMonth.now().getYear() - age;
	}

	@Override
	public String toString() {
		return familyName + " " + name + " " + middleName;
	}
}