package com.q2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student arr[]  = new Student[5];
		
		arr[0] = new Student(1,"Rohit","Tasgaon",66.98);
		arr[1] = new Student(2,"Ronak","Jalgaon",96.98);
		arr[2] = new Student(3,"Atharva","Kolhapur",78.58);
		arr[3] = new Student(4,"Ranjit","Pandharpur",90.45);
		arr[4] = new Student(5,"Abhay","Nagpur",87.32);

		System.out.println("Array Before Sort-");
		for(Student element:arr) 
			System.out.println(element);
		
//		for(int i = 0; i< arr.length;i++)
//			System.out.println(arr[i]);
		
		class cityComparator implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				int value = o1.getCity().compareTo(o2.getCity());
				return value;
			}
			
		}
		
		class markComparator implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				int value = Double.compare(o1.getMarks(), o2.getMarks());
				return value;
			}
			
		}
		
		class nameComparator implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				int value = o1.getName().compareTo(o2.getName());
				return value;
			}
			
		}
		
		Comparator<Student> cCompare = new cityComparator();
		Comparator<Student> mCompare = new markComparator();
		Comparator<Student> nCompare = new nameComparator();
		
		int choice;
		do {
			
			System.out.println("Enter Choice-");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0 : 
					System.out.println("Thank You For Using Our Application!!!!");
				break;
			case 1 : 
				Arrays.sort(arr, cCompare);
				for(int i = 0; i< arr.length;i++)
					System.out.println(arr[i]);
				
				break;
			case 2 : 
				Arrays.sort(arr, mCompare);
				for(int i = 0; i< arr.length;i++)
					System.out.println(arr[i]);
				break;
			case 3 : 
				Arrays.sort(arr, nCompare);
				for(int i = 0; i< arr.length;i++)
					System.out.println(arr[i]);
				break;	
			default:
				System.out.println("Enter A Valid Choice!");
				break;
			}
			
		} while(choice!=0);
		
		
		
		
	}
}
