package com.rohit.q1;
import java.util.Scanner;

public class Invoice {

	private String pnum;
    private String pdesc;
	private int quantity;
	private double price;
	
	public Invoice() {
		this("0","",1,100.0);
	}
	
	public Invoice(String pnum, String pdesc, int quantity, double price) {
		
		
		this.pnum = pnum;
		this.pdesc = pdesc;
		this.quantity = quantity;
		this.price = price;
	}


	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Part Number: ");
		pnum = sc.next();
		sc.nextLine();
		System.out.print("Enter the Part Description : ");
		pdesc = sc.next();
		System.out.print("Enter the Quantity: ");
		quantity = sc.nextInt();
		if(quantity<0) {
			quantity = 0;
		}
		System.out.print("Enter the Price: ");
		price = sc.nextDouble();
		if(price<0) {
			price = 0.0;
		}
		
	}
	
	void display() {
		System.out.println("Part Number is: "+pnum);
		System.out.println("Part Desc is: "+pdesc);
		System.out.println("Quantity is: "+quantity);
		System.out.println("Price is: "+price);

		
	}
	
	public double calculateInvoiceAmt() {
		double resultPrice = (quantity*price);
		return resultPrice;
	}
	
	

}

