package com.emp.salary;

import java.util.Scanner;

public class Salaried extends Employee{
	private double weeklySalary;
	
	
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter the weekly Salary : ");
		weeklySalary = sc.nextDouble();
		
	}
	
	@Override
	public void displayData() {
			super.displayData();
			System.out.println("The Weekly Salary is-" + weeklySalary);
	}
	
	@Override
	public double calculateSalary() {
		return weeklySalary;
	}
	
	@Override
	public String toString() {
		return super.toString()+ weeklySalary;
		
		
	}
}
