package in.co.rays.basics;

public class PrimeNumber {
public static void main(String[] args) {
	int num=16,temp=0, i;
	for (i=2;i<num;i++) {
		if(num%i==0) {
			temp=temp+1;
		}
		}
	    if(temp==0) {
	    	 System.out.println(num+"is a prime Number");
	    }else {
	    	System.out.println(num+"is not prime Number");
	    }
}
}
