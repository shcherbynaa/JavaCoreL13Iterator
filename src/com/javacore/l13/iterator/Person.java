package com.javacore.l13.iterator;

public class Person {
	private double weight;
	private int height;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + "]";
	}
}
