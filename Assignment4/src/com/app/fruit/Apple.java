package com.app.fruit;

public class Apple extends Fruit {

	public Apple() {
		this.setName("Apple");
	}

	public Apple(String name, double weight, String color, boolean isFresh) {
		super(name, weight, color, isFresh);
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
		return "sweet n sour";
	}

}
