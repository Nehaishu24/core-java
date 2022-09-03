package in.co.rays.basics;

public class Armstrong {
public static void main(String[] args) {
	
	int num=153, sum=0;
	int a=0, n=num;
	while(n>0) {
       a=n%10;
       n=n/10;
       sum=sum+(a*a*a);
	}
	if(sum==num){
	  System.out.println("Armstrong Number");}
	else {
	
	  System.out.println("Not Armstrong Number");
}
}

}
