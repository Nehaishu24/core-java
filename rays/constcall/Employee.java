package in.co.rays.constcall;

public class Employee extends Person{

	private String designation;
	public Employee() {
		System.out.println("I Am Empty");
		}
	public Employee(String fn, String ln, String des) {
	super(fn,ln);
	designation =des;
	System.out.println("3 Perameter Constructor "+fn+" "+ln+" "+des);
	}
	public static void main(String[] args) {
		Employee e= new Employee("Neha","Sharma","Faculty");
	}
	}

