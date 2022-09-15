package in.co.rays.sorting.interfac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestMarksheet {
public static void main(String[] args) {
		Marksheet m1= new Marksheet();
		m1.setRollNo ("2");
		m1.setfName("Shivam");
		m1.setlName("Wadhwani");
		m1.setPhy(67);
		m1.setChem(75);
		m1.setMath(59);

		Marksheet m2= new Marksheet();
		m2.setRollNo ("1");
		m2.setfName("Harsh");
		m2.setlName("Gupta");
		m2.setPhy(64);
		m2.setChem(67);
		m2.setMath(79);
		
		Marksheet m3= new Marksheet();
		m3.setRollNo ("5");
		m3.setfName("Shivam");
		m3.setlName("Tiwari");
		m3.setPhy(69);
		m3.setChem(78);
		m3.setMath(69);
		
		Marksheet m4= new Marksheet();
		m4.setRollNo ("4");
		m4.setfName("Preeti");
		m4.setlName("Jain");
		m4.setPhy(63);
		m4.setChem(87);
		m4.setMath(49);
		
		Marksheet m5= new Marksheet();
		m5.setRollNo ("3");
		m5.setfName("Harsh");
		m5.setlName("Pal");
		m5.setPhy(67);
		m5.setChem(47);
		m5.setMath(89);

      ArrayList list = new ArrayList<>();

      list.add(m1);
      list.add(m2);
      list.add(m3);
      list.add(m4);
      list.add(m5);
     
     // Collections.sort(list); // For getting roll no list as roll no is primary key
      Collections.sort(list, new SortByName());;  // For getting sorted list by name
     //	Collections.sort(list, new SortByMath());  // For getting sorted  list by Math subject
     // Collections.sort(list, new SortByPhy());  // For getting sorted  list by Physics subject
     //Collections.sort(list, new SortByChem());    // For getting sorted  list by Chemistry subject
      
      Iterator it =list.iterator();
      
      while(it.hasNext()) {
    	  Marksheet m = (Marksheet) it.next();
    	  System.out.println(m.getRollno()+"  "+m.getfName()+"  "+m.getlName()+"  "+" Phy = "+m.getPhy()+"  "+"Chem = "+m.getChem()+"  "+"Maths = "+m.getMath());
    	  
      }

}
}
