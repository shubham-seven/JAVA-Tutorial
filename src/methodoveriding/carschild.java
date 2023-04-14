package methodoveriding;

public class carschild extends carsoveridingparent{

	public static void main(String[] args) {
		carsoveridingparent c1 = new carschild();//referencing to a parent class 
           c1.engineStart();//c1 can't call method engineOff 
           carschild c2 = new carschild();  //c2 can call both engineOff as well as engineStart
           c2.engineOff();
           
           c1.engineStart(2);
           c2.engineStart(3);
           
           c1.engineStart(0, "dvkjs");
           c2.engineStart(0, "abc");
	}

public void engineOff() {
	System.out.println("Hii i am from child class");
}

@Override
public void engineStart(int n, String s) {
	
	super.engineStart(n, s);
	System.out.print("This is methodoveriding from child class");
}


}
