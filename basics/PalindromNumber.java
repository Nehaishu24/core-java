package in.com.rays.basics;

public class PalindromNumber {
public static void main(String[] args) {
	int num=123321;
	int r=0;
	int sum=0;
	int n=num;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;	}
	  if(sum==num) {
    	   System.out.println("Palindrome Number="+sum);}
	  else {
		  System.out.println("Not Palindrome");
	  }
    	   
    	   
       }
	
}

