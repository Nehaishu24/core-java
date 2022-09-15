package in.co.rays.collection.list.interfac;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInterface {
	public static void main(String[] args) {
		
		List l =new ArrayList();
		l.add(10);
		l.add(25);
		l.add('a');
		l.add("Java");
		System.out.println("l = " +l);
				
		List a =new ArrayList();
		a.add(12);
		a.add(35.5);
		a.add('Y');
		a.add("Rays");
		//a.clear();
		//System.out.println("a = "+a);
		a.addAll(l);
		System.out.println("a = "+a);
		//a.addAll(l);//For adding all together
		//a.clear();//For clearing all together
		//a.contains(a);
		//System.out.println(a.containsAll(l));  
		//System.out.println(a);
		//System.out.println(l.size());
		//System.out.println(a.isEmpty()); //Output will be True Or False 
		//a.iterator();
		//System.out.println(a.remove(2));// for removing one index
		//System.out.println(a);
		//System.out.println(a.removeAll(a));
		//System.out.println(a);
		//System.out.println("a = "+a.retainAll(l)); // it keeps the same elements of two objects and retain the different one 
		//System.out.println("a = "+a);
		System.out.println(a.size());
	}

}