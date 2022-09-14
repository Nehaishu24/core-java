package in.co.rays.collection.list.interfac;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

	public class Vectory {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("One");  //For adding a new element
		v.add("Two");
		v.add("Three");
		
		//System.out.println(v);
	  
    	Vector x =new Vector(); 
	    x.add(56.31);  
	    x.add("Hey");
	    x.add(12.25);
	    x.addAll(v);    //For add one object ['v'] in another object ['x']
	    //x.clear();     //**By Collection Interface Method**
	   // System.out.println(x.contains(12.25));  // **By Collection Interface Method**
	   // System.out.println(x.containsAll(v));
	   //x.isEmpty();     //For checking whether the object is empty
	   // x.remove(1);    //For removing an element 
	   // x.removeAll(v);  // For removing all elements from a given object
	   // System.out.println(x.retainAll(v));  // For keeping the common elements from all the objects and removing the different one
	    // System.out.println(x.size());
	    //   x.add(1, "Shivam");  //For inserting an object on a particular index **By List  Interface Method**  	
	    //	System.out.println(x.get(2)); // Returns an object from given index  ** By List Interface Method**
	    //  System.out.println(x.remove(3)); //Removes an object from given index  **By List Interface Method**
	    //  x.set(1, "Rays"); // Replace the element at given index
	    //	System.out.println(x.subList(0, 3));
	    //  x.indexOf(3); // Searches an element from start and returns index
	     //   System.out.println(x.lastIndexOf(v));
	        System.out.println(x);
	    
	            Iterator it = v.iterator();  // Print all elements by iterator
	            while (it.hasNext()) {
	    		String str =(String) it.next();
	            System.out.println(str);
	}
		    Enumeration en = v. elements();  // Print all elements by Enumeration
		    while (en.hasMoreElements()) {
  			String str = (String) en.nextElement();
  			System.out.println(str);
		    }
}
		    }

