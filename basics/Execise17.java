package in.com.rays.basics;

public class Execise17 {
public static void main(String[] args) {
	int[] a={2,5,11,8,14,17 };
	int[] b= {2,5,8,11,17};
	int r1=0;
	for(int i=0; i<a.length;i++) {
		r1=r1+a[i];}
	{ System.out.println(r1);
	int r2=0;
	for(int i=0; i<b.length;i++) {
		r2=r2+b[i];
		System.out.println(r2);
		System.out.println("Missing Number is:-"+(r1-r2));
	}
}
}
}

