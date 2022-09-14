package in.co.rays.abstractmetod;

public abstract class Shape {

	private static Shape Shape;
	private String color;
	private int borderWidth;

	public Shape() {
	}

	public Shape(String c, int b) {
		color = c;
		borderWidth = b;
	}

	public String getColor() {
		return color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public abstract double area();
	
}