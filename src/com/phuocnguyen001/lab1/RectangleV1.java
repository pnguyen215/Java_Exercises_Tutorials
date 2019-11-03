package com.phuocnguyen001.lab1;

import java.io.Serializable;

public class RectangleV1 implements Shape, Serializable {

	private static final long serialVersionUID = 1L;

	private double length;
	private double width;

	public RectangleV1(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Area of rectangle: " + getArea() + "(unit area)";
	}

}
