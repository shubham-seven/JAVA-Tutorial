package Abstraction;

public class Demo2 extends Demo1{

//If child class is not abstract and parent class is abstract having abstract method also then
//it is mandatory to provide implementation to abstract method in child class
//If child class is also abstract like parent then implementation to abstract method of parent is not mandatory
	public int add(int a,int b) {
		return a+b;
	}
	
}
