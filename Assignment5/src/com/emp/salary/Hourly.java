package com.emp.salary;
import java.util.Scanner;

public class Hourly extends Employee {
	private double wage;
	private double hours;


	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter the wages : ");
		wage = sc.nextDouble();
		System.out.println("Enter the Hours Worked : ");
		hours = sc.nextDouble();
	}

//	@Override
//	public void displayData() {
//		super.displayData();
//		System.out.println("The Hourly Salary is-" + this.calculateSalary());
//	}
	@Override
	public String toString() {
		return super.toString()+ this.calculateSalary();
	}
	
	@Override
	public double calculateSalary() {
		double salary = 0;
		if (hours <= 40) {
			salary = wage * hours;
			System.out.println("The Salary of the Employee is : " + salary);
		} else if (hours > 40) {
			salary = 40 * wage + (hours - 40) * wage * 1.5;
			
		}
		return salary;
	}

}
