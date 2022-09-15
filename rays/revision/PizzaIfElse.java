package in.co.rays.revision;

public class PizzaIfElse {
public static void main(String[] args) {
	int money=345;
	if(money<100) {
		System.out.println("You cant Buy Pizza");
		
	} else if(money>100 && money<300) {
		System.out.println("you can buy medium pizza");
	} else {
		System.out.println("you can buy any pizza");
	}
}
}
