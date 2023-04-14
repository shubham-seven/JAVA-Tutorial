package javaadvancedconcepts;

public class Cars {

	int speed;
	
	public Cars(int startSpeed) {
		speed = startSpeed;
	}
	
	public int increaseSpeed() {
		int incsp=speed+1;
		System.out.printf("Increasing Speed:\n");
		return incsp;
	}
	public int decreaseSpeed() {
		int dcsp=speed-1;
		System.out.printf("Decreasing Speed:\n");
		return dcsp;
	}
}
