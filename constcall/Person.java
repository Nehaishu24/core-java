package in.co.rays.constcall;

public class Person {
		protected String firstName;
		protected String lastName;
		protected String address;
		public Person() {
			System.out.println("I am Default Constructor");
		}
		public Person(String fn,String ln) {
			this();
			this.firstName=fn;
			this.lastName=ln;
			System.out.println("2 perameter constructor: "+fn+"  "+ln);
		}	
		public Person(String fn,String ln,String addr) {
			this(fn,ln);
			this.address=addr;
			System.out.println ("3 Perameter constructor: "+fn+"  "+ln+"  "+addr);
			}
		
		public static void main(String[] args) {
			Person p= new Person("Neha", "Sharma", "Indore");
			
		}
}