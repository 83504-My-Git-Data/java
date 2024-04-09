package com.emp.salary;

import java.util.Scanner;

public class BasePlusCommission extends Commission {
	private double baseSalary;

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter the Base Salary : ");
		baseSalary = sc.nextDouble();
	}
	
	

	@Override
	public double calculateSalary() {
		double salary = (this.getCommissionRate() * this.getGrossSales()+baseSalary);
		return salary;
	}
	
//	@Override
//	public void displayData() {
//		
//		System.out.println("The Salary with Base Plus Commission is-" + this.calculateSalary());
//	}
	
	@Override
	public String toString() {
		return super.toString()+this.calculateSalary();
	}

	public double giveReward() {
		double rewardPlusSalary = baseSalary * 0.1+this.calculateSalary();
		
		return rewardPlusSalary;
	}
}
