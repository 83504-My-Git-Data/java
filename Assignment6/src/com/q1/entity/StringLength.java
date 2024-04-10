package com.q1.entity;

import com.q1.exception.ExceptionLineTooLong;

public class StringLength {
	private String string;

	
	public void setString(String string) throws ExceptionLineTooLong {
			if(string.length()>80)
				throw new ExceptionLineTooLong("The String Length Should be Less Than 80 Characters!!");
			this.string = string;
	}
	
	
	
@Override
public String toString() {
		String string = this.string;
	return string;
}	
}
