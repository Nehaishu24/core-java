package in.co.rays.abstractmetod;

public class Triangle extends Shape {

	private int base;
	private int height;
	public Triangle() {
		System.out.println("I am Triangle");
	}
	public Triangle(int b,int h) {
	base=b;
	height=h;
	double arr=(height*base)/2;
	System.out.println(arr);
	}
	public double area() {
		double arr=(height*base)/2;
		return arr;
	}
}

