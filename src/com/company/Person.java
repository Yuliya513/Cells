package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public abstract class Person {
private FullName fullName;
private int age;

	public Person(FullName fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return age == person.age && Objects.equals(fullName, person.fullName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fullName, age);
	}

	@Override
	public String toString() {
		return "Person{" +
				"fullName=" + fullName +
				", age=" + age +
				'}';
	}

	public  String info(){

		return "FirstName: "+ fullName.getFirstName()
				+" LastName: "+ fullName.getLastName()
				+" age: "+age;
	}

	public abstract String activity();
}
