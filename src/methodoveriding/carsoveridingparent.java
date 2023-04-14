package methodoveriding;

public class carsoveridingparent {

	
	public void engineStart() {
		System.out.println("Hii i am from the parent class");
	}
	
	//Method overloading can be done in 3 ways 
   // 1.First we can use different datatype of parameters 
	
	public void engineStart(int n) {
		System.out.println("This is method overloading from parent class");
	}
	
	//2.Secondly number of parameters we are passing
	
	public void engineStart(int n,String s) {
		System.out.println("This is method overloading eg2 from parent class");
	}
	
	//3.Thirdly we can change the order of passing the argument
	
	public void engineStart(String s,int n) {
		System.out.println("This is method overloading eg2 from parent class");
	}
	
	
	
	//Below example of duplicacy error is given unable to do methodoverload
	//public int engineStart() {
		//return 3;
	}
}
