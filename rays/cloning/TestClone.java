package in.co.rays.cloning;

public class TestClone {
		public static void main(String[] args) throws CloneNotSupportedException {
			
		Address a= new Address();
		a.setStreet("Gulmohar Street ");
		a.setCity("Udaipur ");
		a.setState("Rajasthan ");
		
		
		Employee e=new Employee();
		e.setFirstname("Radhika");
		e.setLastNameString("Roy");
		e.setId("AN5643");
		e.setAddr(a);
		
		System.out.println(e.getFirstname());
		System.out.println(e.getLastNameString());
		System.out.println(e.getId());
		System.out.println(e.getAddr().getStreet());
		System.out.println(e.getAddr().getCity());
		System.out.println(e.getAddr().getState());
		System.out.println("#....#....#....#....#....#");
		
		Employee e1 = (Employee) e.clone();
		System.out.println(e1.getFirstname());
		System.out.println(e1.getLastNameString());
		System.out.println(e1.getId());
		System.out.println(e1.getAddr().getStreet());
		System.out.println(e1.getAddr().getCity());
		System.out.println(e1.getAddr().getState());
		}
}