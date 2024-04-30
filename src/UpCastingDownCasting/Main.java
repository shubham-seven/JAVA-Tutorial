package UpCastingDownCasting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal1 = new Animal();
		System.out.println(animal1.x);
		animal1.noise();
		Cat cat = new Cat();
		System.out.println(cat.x);
		cat.noise();
		Animal animal2 = new Cat();
		System.out.println(animal2.x);
		animal2.noise();
	}

}
