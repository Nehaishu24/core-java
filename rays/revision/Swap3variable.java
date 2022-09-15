package in.co.rays.revision;

public class Swap3variable {
public static void main(String[] args) {
	int a=15,b=30,swap;
	swap=a;
	a=a+b;
	b=a-b;
	a=swap+b;
	System.out.println("Value Of A Is:"+a);
	System.out.println("Value Of B Is:"+b);
}
}
