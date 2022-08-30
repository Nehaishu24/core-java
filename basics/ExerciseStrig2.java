package in.com.rays.basics;

public class ExerciseStrig2 {
public static void main(String[] args) {
	String str="welcome to my lovely home";
	char ch='a';
	for(ch='a'; ch<='z'; ch++) {
		int count=0;
	for(int i=0; i<=str.length()-1; i++) {
		if(str.charAt(i)==ch) {
			count++;
		}
	System.out.println(ch);
	}System.out.println(count);
}
}
}

