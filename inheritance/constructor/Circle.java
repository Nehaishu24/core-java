package in.co.rays.inheritance.constructor;

public class Circle extends Shape {
private int radius;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
public void area() {
	double arr = PI*radius*radius;
	System.out.println("Area Of Circle: "+arr);
}
}
