package com.tester;


import java.util.Scanner;

import com.app.fruit.Apple;
import com.app.fruit.Fruit;
import com.app.fruit.Mango;
import com.app.fruit.Orange;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the Basket-");
		int size = sc.nextInt();
		Fruit f;
		Fruit[] basket = new Fruit[size];

		int choice;
		int index = 0;

		do {
//			System.out.println(Arrays.toString(basket));
			System.out.println("Press 0 to Exit");
			System.out.println("Press 1 to Add Mango");
			System.out.println("Press 2 to Add Orange");
			System.out.println("Press 3 to add Apple");
			System.out.println("Press 4 to Display all the Fruits in the Basket");
			System.out.println("Press 5 to Display name,color,weight , taste of all fresh fruits , in the basket");
			System.out.println("Press 6 Display tastes of all stale(not fresh) fruits in the basket");
			System.out.println("Press 7 to Mark a fruit as stale");
			System.out.println("Press 8 to Mark all sour fruits stale");
			System.out.print("Enter Choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank You For Using the App");
				break;
			case 1:
				if (index < size) {
					f = new Mango();
					f.accept(sc);
					basket[index] = f; 
					index++;
				}
				break;
			case 2:
				if (index < size) {
					f = new Orange();
					f.accept(sc);
					basket[index] = f; 
					index++;
				}
				break;
			case 3:
				if (index < size) {
					f = new Apple();
					f.accept(sc);
					basket[index] = f; 
					index++;
				}
				break;
			case 4:
				
				for (Fruit fruit : basket) {
					if(fruit != null) {
						System.out.println(fruit.getName());
					}else {
						break;
					}
					
				}
				break;
			case 5:
				for (Fruit fruit : basket) {
					if (fruit.isFresh()) {
						System.out.println(fruit.toString());
					}

				}
				break;
			case 6:
				for (int i =0 ; i<size; i++) {
					if (!basket[i].isFresh()) {
						System.out.println(basket[i].getName()+ " : "+ basket[i].taste());
						
						
					}

				}
				break;
			case 7:
				int i;
				System.out.print("Enter the Index of the STale Fruit: ");
				i = sc.nextInt();
				if ( i < basket.length) {
					System.out.println("One Stale fruit is found!");
					basket[i].setFresh(false);
					System.out.println("The Stale one is Removed!!");
					
				}else {
					System.out.println("Enter a valid Index");
				}
				
				break;
			case 8:
				for (int j = 0; j<size; j++) {
					if (basket[j].taste() == "sour") {
						basket[j].setFresh(false);
					}

				}
				break;

			}

		} while (choice != 0);

	}

}
