package in.co.rays.polymorphism;

public class TestLoopShape {
public static void main(String[] args) {
	Shape[] s=new Shape[3];
	s[0]= new Circle(6);
	s[1]= new Rectangle(20,30);
	s[2]= new Triangle(30,25);
	
	double sum=0;
	for(int i=0; i<s.length; i++) {
		System.out.println(s[i].area());
		sum=sum+s[i].area();
	}
	System.out.println("Total Area Is: "+sum);
}

}
