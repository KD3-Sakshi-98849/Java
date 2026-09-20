package com.app.fruits;

abstract public class Fruit {

	private String color;
	private Double weight;
	private String name;
	private boolean isFresh;

	// abstract method
	abstract public String taste();

	// default constructor
	public Fruit() {

	}

	// parameterized constructor
	public Fruit(String color, Double weight, String name) {

		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}

	// getter
	public String getColor() {
		return color;
	}

	// setter
	public void setColor(String color) {
		this.color = color;
	}

	// getter
	public Double getWeight() {
		return weight;
	}

	// setter
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	// getter
	public String getName() {
		return name;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	// getter for boolean
	public boolean isFresh() {
		return isFresh;
	}

	// setter
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	// toString
	@Override
	public String toString() {

		return "Name: " + name +
				", Color: " + color +
				", Weight: " + weight;
	}
}