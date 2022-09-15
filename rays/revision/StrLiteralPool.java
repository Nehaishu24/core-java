package in.co.rays.revision;

public class StrLiteralPool {
public static void main(String[] args) {
	String s= "Sunrays";
	String s1= "Sunrays";
	//System.out.println(s.equals(s1));//For checking value in string 
	//System.out.println(s1.equals(s==s1));//For checking Address in string
	
	String a1= new String("Welcome");
	String a2= new String("Welcome");
	
	System.out.println(a1.equals(a2));
	System.out.println(a2.equals(a1==a2));

}
}
