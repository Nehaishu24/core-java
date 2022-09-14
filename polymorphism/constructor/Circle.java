package in.co.rays.polymorphism.constructor;

public class Circle extends Shape {
	
 private int radius;

 public static final double PI=3.14;
		 public Circle() {
			 
		 }
	public Circle(int r) {
	radius=r;
}
	public double area() {
		double arr=PI*radius*radius;
		return arr;
		}
}