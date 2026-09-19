package com.app.geometry;
import java.util.*;
public class Customer {

	private int accountNumber;
	private int beginningBalance;
	private int charges;
	private int credits;
	private int creditlimit;
//	private Customer c1;
	public Customer(int accountNumber,int beginningBalance,
			 int charges,int credits, int creditlimit)
	{
		this.accountNumber=accountNumber;
		this.beginningBalance=beginningBalance;
		this.charges=charges;
		this.credits=credits;
		this.creditlimit=creditlimit;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBeginningBalance() {
		return beginningBalance;
	}
	public void setBeginningBalance(int beginningBalance) {
		this.beginningBalance = beginningBalance;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getCreditlimit() {
		return creditlimit;
	}
	public void setCreditlimit(int creditlimit) {
		this.creditlimit = creditlimit;
	}
	public int calculateBalance() {
		 return beginningBalance + charges - credits;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Account Number:");
   int accountNumber=sc.nextInt();
   System.out.println("Enter Begining Balance:");
   int beginningBalance=sc.nextInt();
   System.out.println("Enter total charges:");
   int charges=sc.nextInt();
   System.out.println("Enter total credits:");
   int credits=sc.nextInt();
   System.out.println("enter credit card limit");
   int creditlimit=sc.nextInt();
		Customer c1=new Customer( accountNumber,
                beginningBalance,
                charges,
                credits,
                creditlimit);
	
//	int newBalance= c1.calculateBalance();
	int newBalance=c1.calculateBalance();
	System.out.println("Account  Number:"+c1.getAccountNumber());
	 System.out.println("New Balance: " + newBalance);
	 if(newBalance>c1.getCreditlimit()) {
		   System.out.println("Credit limit exceeded");
	 }

	}

}
