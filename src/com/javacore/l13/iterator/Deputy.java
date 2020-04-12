package com.javacore.l13.iterator;

import java.util.Scanner;

public class Deputy extends Person {
	private String surname;
	private String name;
	private int age;
	private boolean bribetaker;
	private int sum;
	
	public Deputy(String surname, String name, int age, boolean bribetaker) {
		super();
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.bribetaker = bribetaker;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribetaker() {
		return bribetaker;
	}

	public void setBribetaker(boolean bribetaker) {
		this.bribetaker = bribetaker;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	@Override
	public String toString() {
		return "Deputy [surname=" + surname + ", name=" + name + ", age=" + age + ", bribetaker=" + bribetaker
				+ ", sum=" + sum + "]";
	}

	public void giveBribe() {
		if (bribetaker == false) {
			System.out.println("This deputy DON'T take bribes");
		}else {
			Scanner sc = new Scanner(System.in);
			int bribe = sc.nextInt();
			if(bribe >= 5000) {
				System.out.println("The police detain the deputy");
			}else {
				this.sum = bribe;
			}
		}
	}
}
