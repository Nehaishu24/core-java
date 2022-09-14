package in.co.rays.polymorphism.constructor;

public class TestShape {
public static void main(String[] args) {
	Shape[] s=new Shape[3];
	s[0]=new Circle(6);
	s[1]=new Rectangle(25,30);
    s[2]=new Triangle(20,40);
    System.out.println("Area Of Circle Is: "+s[0].area());
    System.out.println("Area Of Rectangle Is: "+s[1].area());
    System.out.println("Area Of Triangle Is: "+s[2].area());
}
}