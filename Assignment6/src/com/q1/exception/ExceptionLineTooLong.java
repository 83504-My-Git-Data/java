package com.q1.exception;

@SuppressWarnings("serial")
public class ExceptionLineTooLong extends Exception{
	private String message;
	
	public ExceptionLineTooLong() {
		this.message = "";
	}
	
	public ExceptionLineTooLong(String message) {
		this.message = message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println("Exception: ");
		System.err.println("ExceptionLineTooLong: "+message);
		
	}
}
