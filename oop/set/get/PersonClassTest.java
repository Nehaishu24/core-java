package in.co.oop.set.get;

public class PersonClassTest {
public static void main(String[] args) {
		PersonClass n =new PersonClass();
	n.setName("Neha");
	n.setDob("24/09/1989");
	n.setAddress("Indore");
	System.out.println("name=="+n.getName());
	System.out.println("dob=="+n.getDob());
	System.out.println("address=="+n.getAddress());
}
}
