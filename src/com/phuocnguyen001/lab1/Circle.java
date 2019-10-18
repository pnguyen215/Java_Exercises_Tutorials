package com.phuocnguyen.lab1;

public class Circle {

	private double radius;
	private String color;

	public Circle() {
		super();
	}

	public Circle(double radius, String color) {
		super();
		this.radius = 1.0;
		this.color = "red";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
