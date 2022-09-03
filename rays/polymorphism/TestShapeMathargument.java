package in.co.rays.polymorphism;

public class TestShapeMathargument {
public static void main(String[] args) {
	Shape[] s=new Shape[3];
	s[0] = new Circle(6);
    s[1] = new Rectangle(25,45);
    s[2] = new Triangle(50,30);
    double tarea=calArea(s);
    System.out.println("Total Area Is: "+tarea);
}
    public static double calArea(Shape[]s) {
    	double tarr=0;
    	for(int i=0; i<s.length; i++) {
    		tarr=tarr+s[i].area();
    	} return tarr;
    }
}
