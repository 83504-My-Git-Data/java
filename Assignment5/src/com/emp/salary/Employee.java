package com.emp.salary;

import java.util.Scanner;

abstract public class Employee {
	private String firstName;
	private String lastName;
	private int ssn;

	public Employee() {

	}

	public Employee(String firstName, String lastName, int ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public abstract double calculateSalary();

	public void acceptData(Scanner sc) {
		System.out.println("Enter the First Name: ");
		firstName = sc.next();
		System.out.println("Enter the Last Name: ");
		lastName = sc.next();

	}

	public void displayData() {
		System.out.println("The First Name is-" + firstName);
		System.out.println("The Last Name is-" + lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "The Employee " + firstName + " " + lastName + " Has Salary - ";
	}

}
