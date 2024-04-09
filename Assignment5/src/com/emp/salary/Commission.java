package com.emp.salary;

import java.util.Scanner;

public class Commission extends Employee {
	private int grossSales;
	private double commissionRate;

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter the Gross Sales : ");
		grossSales = sc.nextInt();
		System.out.println("Enter the Commission Rate : ");
		commissionRate = sc.nextDouble();
	}

//	@Override
//	public void displayData() {
//		super.displayData();
//		System.out.println("The Salary with Commission is-" + this.calculateSalary());
//	}

	@Override
	public String toString() {

		return super.toString() + this.calculateSalary();
	}

	@Override
	public double calculateSalary() {
		double salary = commissionRate * grossSales;
		return salary;
	}

	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

}
