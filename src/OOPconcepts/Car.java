package OOPconcepts;

public class Car {
 
	public String color;
	public int speed;
	public int gear;
	private String model;
	private String make;
	
	public void increasespeed() {
		System.out.println("Increase the speed:");
	}
public void setMake(String make) {
	this.make=make;
	}
public String getMake() {
	return this.make;
}
public void setmodel(String model) {
	this.model=model;
}
public String getmodel(){
	return this.model;
}
public void setSpeed(int speed) {
	this.speed=speed;
	
}
public int getSpeed() {
 return this.speed;
}
public void setGear(int gear) {
	this.gear=gear;
	
}
public int getGear() {
 return this.gear;
}


public Car() {
	this.speed=0;
	this.gear=0;
	System.out.println("Executing constructor without arguments");

}

public Car(int speed,int gear) {
	this.speed=speed;
	this.gear=gear;
	System.out.println("Executing constructor with arguments");
}
}
