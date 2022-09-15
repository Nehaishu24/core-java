package in.co.rays.cloning;

public class Employee implements Cloneable {
	
	private String id;
	private String firstname;
	private String lastNameString;
	private Address addr;
	
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Employee() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastNameString() {
		return lastNameString;
	}
	public void setLastNameString(String lastNameString) {
		this.lastNameString = lastNameString;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}