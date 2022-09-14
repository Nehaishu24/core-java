package in.co.rays.sorting.interfac;

import java.util.Comparator;

public class SortByMath implements Comparator<Marksheet>{
		
		public int compare(Marksheet m1,Marksheet m2) {
			
		return m1.getMath()-m2.getMath();
	}
	}
