package OOPconcepts;

public class methodsdemo {
	

	public static void main(String[] args) {
    Car bmw = new Car();
    bmw.setMake("shubham"); 

    		System.out.println("Owners name: "+ bmw.getMake());
    		
    		Car benz = new Car();
    		benz.setmodel("7#92");
    		System.out.println("model no: " + benz.getmodel());
	}
}
