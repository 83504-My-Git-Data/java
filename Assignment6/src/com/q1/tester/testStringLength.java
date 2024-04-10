package com.q1.tester;

import java.util.Scanner;

import com.q1.entity.StringLength;
import com.q1.exception.ExceptionLineTooLong;

public class testStringLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string;
		try {
			System.out.print("Enter the String : ");
			string = sc.next();
			StringLength s = new StringLength();
			s.setString(string);
			System.out.println("The String: "+s.toString());
			System.out.println("The String Length: "+string.length());
		}catch(ExceptionLineTooLong e) {
			e.printStackTrace();
		}finally{
			sc.close();
		}
	}
}
