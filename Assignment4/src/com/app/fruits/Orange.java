package com.app.fruits;

public class Orange extends Fruit{
	public Orange(String Name,Double Weight,String color) {
		super(Name,Weight,color);
	}
	@Override
	
	public String taste() {
		return "sour";
	}
}
