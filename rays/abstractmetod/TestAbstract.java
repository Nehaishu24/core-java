package in.co.rays.abstractmetod;

public class TestAbstract {
public static void main(String[] args) {
	
	Shape[] s=new Shape[3];
	s[0] = new Circle(6);
	s[1] = new Rectangle(25,15);
	s[2] = new Triangle(20,30);
	
	s.getShape(1);
	Circle c=new Circle(6);
	System.out.println(c.area());
	c.area();
	
	s.getShape(2);
	Rectangle r=new Rectangle(25,15);
	System.out.println(r.area());
	
	s.getShape(3);
	Triangle t=new Triangle(30,20);
	System.out.println(t.area());
}
}