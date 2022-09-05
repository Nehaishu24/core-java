package in.co.rays.inrterface1;

public class Businessman implements Richman,SocialWorker{

	@Override
	public void helpToOthers() {
		System.out.println("I Am Helping To  Others:");
		}
    @Override
	public void earnMoney() {
		System.out.println("I Am Earning Money: ");
		}
    @Override
	public void donation() {
		System.out.println("I Am Giving Donation:");
		}
    @Override
	public void party() {
		System.out.println("I Am Doing Party: ");
    }
    
	 public static void main(String[]args) {
		 SocialWorker s=new Businessman();
		 s.helpToOthers();
		 Richman rm=new Businessman();
		 rm.earnMoney();
		 rm.donation();
		 rm.party();
	 
	 }
	 
	}