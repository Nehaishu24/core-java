package in.co.oop.set.get;

public class AutomobileClassTest {
public static void main(String[] args) {
	AutomobileClass auto =new AutomobileClass();
	auto.setColor("Gray");
	auto.setMake("Audi");
	System.out.println(auto.getColor());
	System.out.println(auto.getMake());
	auto.changeGear(1);
	auto.accelerator();
	auto.getSpeed();
	auto.changeGear(2);
	auto.accelerator();
	auto.getSpeed();
	auto.Break();
	auto.getSpeed();
} 

}
