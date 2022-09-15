package in.co.rays.revision;

public class ReverseExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12;
		while(num>0)
		{
			int rev=num%10;
			num=num/10;
			System.out.print(rev);
		}

	}

}
