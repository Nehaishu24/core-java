package in.co.oop.set.get;
public class AccountClass {
	private String number;
	private String accountType;
	private double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
    public String getAccountType() {
		return accountType;
	}
    public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
    public double getBalance() {
		return balance;
	}
    public void setBalance(double balance) {
		this.balance = balance;
	}
	public void withdrawal(double wd) {
		double total = getBalance() - wd;
		setBalance(total);
		System.out.println("Balance After Withdrawal = " + getBalance());
		}
	public void deposit(double depo) {
	double total = getBalance() + depo;
		setBalance(total);
		System.out.println("Balance After Deposit = " + getBalance());
	}public void fundTransfer(double Ft) {
	 double total=getBalance()-Ft;
	 setBalance(total);
	 System.out.println("Balance After Deposit= "+getBalance());
	 }public void payBill(double Pb) {
		 double total= getBalance()-Pb;
		 setBalance(total);
		 System.out.println("Balance After Pay Bill= "+getBalance());
	 }
}
