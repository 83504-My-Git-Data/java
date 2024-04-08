package com.app.fruit;

import java.util.Scanner;

public class Fruit {

	private String name;
	private double weight;
	private String color;
	private boolean isFresh = true;

	
	public Fruit(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}
	
	public Fruit(String name, double weight, String color, boolean isFresh) {

		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public void accept(Scanner sc) {
		
		System.out.println("Enter the Color-");
		color = sc.next();
		System.out.println("Enter the Weight-");
		weight = sc.nextDouble();
	}

	public void display() {
		System.out.println("The Fruit Name-"+name);
		System.out.println("The Fruit Weight-"+weight);
		System.out.println("The Fruit Color-"+color);
		
	}
	
	public Fruit() {
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String taste() {
		return "no specific taste";
	}
	
	@Override
	public String toString() {
		String result = "Name: "+ name + ", Color: "+ color+", Is Fresh: "+ isFresh;
		return result;
	}
	

}
