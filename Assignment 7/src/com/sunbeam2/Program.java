package com.sunbeam2;
import java.util.*;
public class Program {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		System.out.println("x coordinate:"+c.getMyX());
		System.out.println("y cordinate:"+c.getMyY());
		System.out.println("Diameter:"+c.getMyDiameter());
	
		System.out.println("Enter new Diameter:");
		double diameter=sc.nextDouble();
		
		try {
			c.setMyDiameter(diameter);
			System.out.println("Diameter:"+c.getMyDiameter());
		}catch(InvalidDiameterException e) {
			System.out.println(e.getMessage());
		}
//		sc.close();
	}

}
