package in.co.rays.inheritance.constructor;

public class Rectangle {

	private int length;
	private int width;
	public int getLength() {
	return length;
	}
	public void setLength(int length) {
	this.length = length;
	}
	public int getWidth() {
	return width;
	}
	public void setWidth(int width) {	
	this.width = width;
	}
     public void area() {
    	 double arr=length*width;
    	 System.out.println("Area Of Rectangle: "+arr);
     }
	}
