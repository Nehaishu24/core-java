package in.co.rays.revision;

public class Addmethod {
	int a=30,b=50;
	public void add() {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Addmethod t=new Addmethod();
		t.add();
		t.sub();
		t.multi();
		t.division(30,40);
	}
	public void sub() {
	int a=40, b=25;
	System.out.println(a-b);
	}
	public void multi() {
		int a=20,b=60;
		System.out.println(a*b);
	}

	public int division(int a, int b) {
		int division  = a/b;
		return a/b;
	
	}
	
	
}