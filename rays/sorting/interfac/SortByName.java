package in.co.rays.sorting.interfac;

import java.util.Comparator;

public class SortByName implements Comparator<Marksheet>{

	public int compare(Marksheet n1, Marksheet n2) {
		if (n1.getfName()== n2.getfName()) {
			return n1.getlName().compareTo(n2.getlName());
	}   else {
		return n1.getfName().compareTo(n2.getfName()); 
	}
	}	
}
