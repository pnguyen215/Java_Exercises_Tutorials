package com.phuocnguyen001.lab1;

public class Rectangle {

	private float lenght;
	private float width;

	public Rectangle() {
		super();
	}

	public Rectangle(float lenght, float width) {
		super();
		this.lenght = 1.0f;
		this.width = 1.0f;
	}

	public float getLenght() {
		return lenght;
	}

	public void setLenght(float lenght) {
		this.lenght = lenght;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public double getArea() {
		return lenght * width;
	}

	public double getPrimeter() {
		return (lenght + width) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle[lenght = " + this.lenght + ", " + "width = " + this.width + "]";
	}
}
