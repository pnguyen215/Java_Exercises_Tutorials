package com.phuocnguyen.lab1;

import java.io.Serializable;

public class Triangle implements Shape, Serializable {

	private static final long serialVersionUID = 1L;

	private double base;
	private double height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return this.base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return 0.5 * base * height;
	}

	@Override
	public String toString() {
		return "Area of triangle: " + getArea() + "(unit area)";
	}
}
