package in.co.rays.basics;

public class Starpattern {
public static void main(String[] args) {
	int  i,j,k;
	for(i=0; i<5; i++)     {
		  for(j=5; j>i; j--) {
			System.out.print(" ");
		  }
		  for(j=0; j<(i*2)+1; j++){
			  System.out.print("*");
		  }System.out.println();          
		} for(i=5; i>=0; i--) {
			for(k=5; k>i; k--) {
				System.out.print(" ");}
			for(j=0; j<(i*2)+1; j++) {
				System.out.print("*");
			} System.out.println();
			}
		}
}

