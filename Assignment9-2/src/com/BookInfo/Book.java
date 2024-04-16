package com.BookInfo;

import java.util.Objects;
import java.util.Scanner;

import com.catagory.Catagory;


public class Book {
	private String isbn;
	private double price;
	private Catagory catagory;
	private String authorName;
	private int quantity;
	
	
	public Book() {}
	
	public Book(String isbn, double price, Catagory catagory, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.catagory = catagory;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public void acceptData(Scanner sc) {
		System.out.println("Enter isbn : ");
		isbn = sc.next();
		System.out.println("Enter Price : ");
		price = sc.nextDouble();
		System.out.println("Enter 0 for Comics");
		System.out.println("Enter 1 for Poetry");
		System.out.println("Enter 2 for Novel");
		int cat = sc.nextInt();
		catagory = Catagory.values()[cat];
		System.out.println("Enter Author Name : ");
		authorName = sc.next();
		System.out.println("Enter Quantity : ");
		quantity = sc.nextInt();
	}
	
	
	public Catagory getCatagory() {
		return catagory;
	}

	public void setCatagory(Catagory catagory) {
		this.catagory = catagory;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", catagory=" + catagory + ", authorName=" + authorName
				+ ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}
	
	
	
	
	
	
}
