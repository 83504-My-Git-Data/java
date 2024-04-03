package com.rohit.q1;
import java.util.Scanner;

public class InvoiveTest {

	public static void main(String[] args) {
		
		Invoice i = new Invoice();
		i.accept();
		i.display();
		System.out.println("The Invoice amt is:"+i.calculateInvoiceAmt());
		
	}

}
