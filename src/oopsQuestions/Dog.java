package oopsQuestions;


public class Dog {
	
	String name;
	String breed;

	public Dog(String name,String breed) {
		this.name=name;
		this.breed=breed;
	}
	
	public void setDogAttribute(String name,String breed) {
		this.name=name;
		this.breed=breed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1 = new Dog("tobo", "Shepherd");
		Dog dog2 = new Dog("rambo", "Labra");
		System.out.println("Name:"+dog1.name+"\nBreed:"+dog1.breed);
		System.out.println("Name:"+dog2.name+"\nBreed:"+dog2.breed);
		
		dog1.setDogAttribute("jacky", "pomaleon");
		dog2.setDogAttribute("dany", "dobarman");
		
		System.out.println("Name:"+dog1.name+"\nBreed:"+dog1.breed);
		System.out.println("Name:"+dog2.name+"\nBreed:"+dog2.breed);

		
	}
	

}
