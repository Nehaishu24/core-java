package in.co.rays.abstractmetod;

public class Rectangle extends Shape {

	private int length;
	private int width;
	public Rectangle() {
		System.out.println("I am Rectangle");
	}
	public Rectangle(int l,int w) {
		length=l;
		width=w;
		double arr=length*width;
		System.out.println(arr);
		
	}
	public  double area() {
		double arr=length*width;
		return arr;
	}
	}
