package OOPconcepts;

public class constructorsdemo {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.printf("Speed of the car is :%d \n",c1.speed);
		System.out.printf("Gear in which car is :%d \n",c1.gear);

		
		
		Car c2 = new Car(50,2);
		System.out.printf("Speed of the car is :%d \n",c2.speed);
		System.out.printf("Gear in which car is :%d \n",c2.gear);

	}

}
