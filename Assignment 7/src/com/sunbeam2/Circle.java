package com.sunbeam2;

public class Circle {

	private double myX;
	private double myY;
	private double myDiameter;
	
	public Circle() {
		myX=0;
		myY=0;
		myDiameter=100;
	}

	public double getMyX() {
		return myX;
	}

	public void setMyX(double myX) {
		this.myX = myX;
	}

	public double getMyY() {
		return myY;
	}

	public void setMyY(double myY) {
		this.myY = myY;
	}

	public double getMyDiameter() {
		return myDiameter;
	}

	public void setMyDiameter(double myDiameter) throws InvalidDiameterException{
		if(myDiameter < 0) {
			throw new InvalidDiameterException();
		}
//		myDiameter=diameter;
	}
}
