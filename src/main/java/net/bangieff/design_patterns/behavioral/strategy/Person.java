package net.bangieff.design_patterns.behavioral.strategy;

public class Person {
	private int age;
	private String name;
	private String phoneNumber;
	
	public Person() {
		
	}
	
	public Person(String name, String phoneNumber, int age) {
		this.setAge(age);
		this.setName(name);
		this.setPhoneNumber(phoneNumber);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
