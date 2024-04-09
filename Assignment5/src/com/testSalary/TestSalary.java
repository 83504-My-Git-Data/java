package com.testSalary;

import java.util.Scanner;
import com.emp.salary.*;

public class TestSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e;
		int choice;
		System.out.println("Enter Your Choice: ");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			e = new Salaried();
			e.acceptData(sc);
			e.calculateSalary();
//			e.displayData();
			System.out.println(e.toString());
			break;
		case 2:
			e = new Hourly();
			e.acceptData(sc);
			e.calculateSalary();
//			e.displayData();
			System.out.println(e.toString());
			break;
		case 3:
			e = new Commission();
			e.acceptData(sc);
			e.calculateSalary();
//			e.displayData();
			System.out.println(e.toString());
			break;
		case 4:
			e = new BasePlusCommission();
			e.acceptData(sc);
			e.calculateSalary();
//			e.displayData();
			System.out.println(e.toString());
			BasePlusCommission e1 = (BasePlusCommission) e;  //downcasting
			System.out.println("The Salary with the Reward is : "+e1.giveReward());
				
		
			break;
		
		}

	}

}
