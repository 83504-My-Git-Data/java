package com.app.fruit;

public class Mango extends Fruit {

	public Mango() {
		this.setName("Mango");
	}

	public Mango(double weight, String color) {
		super(color, weight);

	}

	public void accept() {

	}

	public void display() {

	}

	@Override
	public String toString() {
		String result = "name : " + this.getName() + ", color : " + this.getColor() + ", isFresh : " + this.isFresh()
				+ ", taste : " + taste();
		return result;
	}

	public String taste() {
		return "sweet";
	}
}