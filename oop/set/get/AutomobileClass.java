package in.co.oop.set.get;

public class AutomobileClass {
private String color;
private int speed;
private String make;
public static final int NO_OF_GEAR = 6;
public int gear; 

public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}public void changeGear(int CG) {
	if(CG>=1 && CG<=NO_OF_GEAR) {
		gear=CG;
		System.out.println("Gear Number: "+gear);
	}
}
	public void accelerator() {
		switch(gear) {
		case 1:speed =15;
		break;
		case 2:speed =30;
		break;
		case 3:speed =60;
		break;
		case 4:speed =80;
		break;
		case 5:speed =100;
		break;
		case 6:speed =120;
		break;
		}
	}public void Break() {
		speed=0;
		gear=0;
		}
	public int getSpeed() {
		System.out.println("Speed Of Your Audi Is: "+speed);
	 return speed;
	
	}

}
