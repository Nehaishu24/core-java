package in.co.oop.set.get;

public class AccountClassTest {
 public static void main(String[] args) {
	AccountClass acc=new AccountClass(); 
    acc.setNumber("00156743890");
    acc.setAccountType("Saving Account");
    acc.setBalance(15000.80);
    System.out.println("Account Number: "+acc.getNumber());
    System.out.println("Account Type: "+acc.getAccountType());
    System.out.println("Available Balance "+acc.getBalance());
    acc.deposit(12000);
    acc.withdrawal(16000);
    acc.fundTransfer(5000);
    acc.payBill(500);
 }
}
