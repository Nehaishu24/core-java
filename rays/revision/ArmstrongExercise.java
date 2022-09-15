package in.co.rays.revision;

public class ArmstrongExercise {
public static void main(String[] args) {
	int number=371, arm=0;
	int num=number; int sum=0;
	while(number>0) {
		 arm=number%10;
		 
		 sum=sum+(arm*arm*arm);
				 
		 number=number/10;
	}
		if(num==sum) {
		
		System.out.println("Armstrong Number");
		}
		
	else {
		System.out.println("Not Armstrong Number");
}
}
}
