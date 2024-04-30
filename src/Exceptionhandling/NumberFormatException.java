package Exceptionhandling;

import java.util.Scanner;

public class NumberFormatException {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     try {
    	System.out.println(getInteger(str));
	} catch (Exception n) {
		// TODO: handle exception
		System.out.println("null");
	}
             

		

	}
	// Return the parsed Integer, or null in the case of a NumberFormatException
    static Integer getInteger(String source) {
        // Your code goes here.
        
        return Integer.parseInt(source);
    }

}
