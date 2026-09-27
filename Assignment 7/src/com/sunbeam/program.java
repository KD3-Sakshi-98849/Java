package com.sunbeam;
import java.util.*;

public class program {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String line=sc.nextLine();
	int count=0;
	
	for(int i=0;i<line.length();i++) {
//		line.trim();
		char ch=line.charAt(i);
		if(ch!=' ') {
		count++;
		}
	}
	System.out.println("Characte count is:"+count);
	try {
		if(count>80) {
			throw new ExceptionLineTooLong();
		}
		else {
			System.out.println("OK");
		
	}

	}catch(ExceptionLineTooLong e) {
		System.out.println(e.getMessage());
	}
	sc.close();
}
}