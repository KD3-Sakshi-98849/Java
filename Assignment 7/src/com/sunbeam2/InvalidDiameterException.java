package com.sunbeam2;

public class InvalidDiameterException extends Exception {

	public InvalidDiameterException() {
		super("Diameter cannot be negative");
	}
}
