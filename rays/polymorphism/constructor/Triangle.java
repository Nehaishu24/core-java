package in.co.rays.polymorphism.constructor;

public class Triangle extends Shape {
 
	private int base;
	private int height;
	public Triangle() {
	}
		
	public Triangle(int h,int b) {
	height=h;
	base=b;
    }
    public  double area() {
    double arr =(height*base)/2;
    return arr;
    }
} 



