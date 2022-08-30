package in.com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
        Person p = new Person();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date today = sdf.parse("24/09/1989");
        p.setName("Neha");
		p.setDob(today);
        p.setAddress("Indore");
		System.out.println(sdf.format(p.getDob()));
        System.out.println(p.getName());
	    System.out.println(p.getAddress());
	}
}
