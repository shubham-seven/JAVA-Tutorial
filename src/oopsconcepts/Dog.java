package oopsconcepts;

public class Dog extends Animal{

	public void display(String name) {
		System.out.println("dogs name:"+name);
	}
	//Method override example
	@Override
	public void eat() {
		System.out.println("This is dog class eat method");
		System.out.println(name);
	}
}
