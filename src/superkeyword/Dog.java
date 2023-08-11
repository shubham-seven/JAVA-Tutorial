package superkeyword;

class Dog extends Animal {

	  // default or no-arg constructor of class Dog
	  Dog() {

	    // calling default constructor of the superclass
		  //if we even dont use super still default constructor will be called we use super for calling parametrized constructors
	   //super();
//parametrized constructor calling
	   super("snake");
	   //constructor call must be the first statement inside constructor
	    System.out.println("I am a dog");
	  }
	}

