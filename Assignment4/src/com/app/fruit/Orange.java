package com.app.fruit;

public class Orange extends Fruit {

	public Orange() {
		this.setName("Orange");
	}

	public Orange(double weight, String color) {
		super(color, weight);

	}

	public Orange(String name, double weight, String color, boolean isFresh) {
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
		return "sour";
	}

}
