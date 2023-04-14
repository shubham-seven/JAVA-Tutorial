package javaadvancedconcepts;

public class inheritance {

	
	public static void main (String[] args) {
		
		Cars c1 = new Cars(10);
		System.out.printf("Increased speed: %d \nDecreased speed: %d \n speed: %d \n", c1.increaseSpeed(),c1.decreaseSpeed(),c1.speed);
		
		BMW b1 = new BMW(20);
		System.out.printf("Increased speed: %d \nDecreased speed: %d \n speed: %d \n",b1.increaseSpeed(),b1.decreaseSpeed(),b1.speed);
		
	}
	
}
