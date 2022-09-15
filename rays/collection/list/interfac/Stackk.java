package in.co.rays.collection.list.interfac;

import java.util.Iterator;
import java.util.Stack;

public class Stackk {
public static void main(String[] args) {
	Stack s = new Stack();
	s.push("Hello User");
	s.push("Start Your Program");
	s.push("2424");
	s.push('H');   
	
	Object obj2 = s.peek(); //Returns top and does not remove it
	
	Object obj3 = s.pop();  // Returns top and remove it from stack
	//Object obj2 = s.pop();
	System.out.println(s);
	
	 Iterator it = s.iterator();
	 while (it.hasNext()) {
	 String str = (String) it.next();
	System.out.println(str);	 
	 }
	
	
	
	
	
	
	
}
}
