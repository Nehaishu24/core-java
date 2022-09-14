package in.co.rays.abstractmetod;

public class Circle extends Shape {

	private int radius;
	public static final double PI=3.14;
	public Circle(){
		System.out.println("I am Circle");
	}

	public Circle(int r) {
	radius=r;
	double arr=PI*radius*radius;
	System.out.println(arr);
	}
	public double area() {
		double arr=PI*radius*radius;
		return arr;
	}

	}
