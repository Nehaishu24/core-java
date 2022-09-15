package in.co.rays.revision;

public class GradingSystem {
public static void main(String[] args) {
	int marks =79;
	if(marks>=91)
	{
		System.out.println("Grade A");	
	}
	else if(marks>=80){
		System.out.println("Grade B");
	}
	else if(marks>=70)
	{
		System.out.println("Grade C");
	}
	else if(marks>=60) {
		System.out.println("Grade D");
	}
	else if(marks<=35) {
		System.out.println("Fail");
	}
}
}
