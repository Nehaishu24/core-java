package in.co.rays.abstractmetod;

public class Triangle extends Shape {

	private int base;
	private int height;
	public Triangle() {
	}
	public Triangle(int b,int h) {
	base=b;
	height=h;
	}
	public double area() {
		double arr=(height*base)/2;
		return arr;
	}
}

