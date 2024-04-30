package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Here We are not achieving abstraction as control is going to sample class 
		//where method implementation is there & we have to hide implementation
	/*	
		Sample1 s1 = new Sample1();
		s1.test();
		s1.disp();
		*/
		//Upcating is there and we are acheiving abstraction but we cant call disp() method
		//As reference type is Demo1 and it is not having disp() method 
		//So overriden test() method will be called presenet in sample class
		Demo1 demo1 = new Sample1();
		demo1.test();
		
		//Upcating is there and we are acheiving abstraction here we can call disp() method
		//AS Demo2 is inheriting Demo1 so having both test() and disp() method
		//So both overriden method will be called
		Demo2 demo2 = new Sample1();
		demo2.test();
		demo2.disp();
	}

}
