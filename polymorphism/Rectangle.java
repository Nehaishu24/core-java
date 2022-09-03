package in.co.rays.polymorphism;

public class Rectangle extends Shape{
   private int length;
   private int width;
  
   public Rectangle() {
  }
  
   public Rectangle(int l,int w) {
	length=l;
	width=w;
   }
	public double area() {
		double arr=length*width;
		return arr;
	}
	}


