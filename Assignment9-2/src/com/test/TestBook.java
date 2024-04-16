package com.test;

import com.BookInfo.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TestBook {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book b;
		int choice;
		Set<Book> books = new HashSet<>(); 
		do {
			System.out.println("0. Exit");
			System.out.println("1. Accept Book Details and Add In Collection");
			System.out.println("2. Display All the Books ");
			System.out.println("3. Sort the book details as per category and display it");
			System.out.println("4. Sort the book details as per author and display it");
			System.out.println("5. Find book by id");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				b = new Book();
				b.acceptData(sc);
				
				books.add(b);
				break;
			case 2 :
				for (Book element : books) {
					System.out.println(element);
				}
				break;
			case 3 :
				List<Book> arr = new ArrayList<>();
				for (Book element : books) {
					arr.add(element);
				}
				class AuthorCompare implements Comparator<Book>{

					@Override
					public int compare(Book o1, Book o2) {
						return o1.getCatagory().compareTo(o2.getCatagory());
					}	
				}
				Comparator<Book> catCompare = new AuthorCompare();
				Collections.sort(arr,catCompare);
				for (Book book : arr) {
					System.out.println(book);
				}
				break;
				
			case 4 :
				List<Book> list = new ArrayList<>();
				for (Book element : books) {
					list.add(element);
				}
				class AuthorCompare implements Comparator<Book>{

					@Override
					public int compare(Book o1, Book o2) {
						return o1.getAuthorName().compareTo(o2.getAuthorName());
					}	
				}
				Comparator<Book> authCompare = new AuthorCompare();
				Collections.sort(list,authCompare);
				for (Book book : list) {
					System.out.println(book);
				}
				break;
			
			case 5 : 
				b = new Book();
				System.out.print("Enter the ISBN ID - ");
				String isbn = sc.next();			
				b.setIsbn(isbn);
				for (Book element : books) {
					if(element.getIsbn().equals(b.getIsbn())){ 
						System.out.println(element);
					} 
				}
				break;
			}
		} while(choice!=0);
	}

}
