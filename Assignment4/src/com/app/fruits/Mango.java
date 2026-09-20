package com.app.fruits;

public class Mango extends Fruit{
	public Mango(String Name,Double Weight,String color) {
		super(Name,Weight,color);
	}
	@Override
	public String taste() {
		return "sweet";
	}
}
