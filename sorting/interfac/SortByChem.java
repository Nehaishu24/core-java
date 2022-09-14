package in.co.rays.sorting.interfac;

import java.util.Comparator;

public class SortByChem implements Comparator<Marksheet> {
	public int compare( Marksheet m1, Marksheet m2){
		return m1.getChem()-m2.getChem();

}
}