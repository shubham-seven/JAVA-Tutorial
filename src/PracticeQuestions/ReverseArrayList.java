package PracticeQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {

	public static void main(String[]args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter List Size:");
		int noOfElements = scanner.nextInt();
		System.out.println("");
		int number;
        for(int i=0;i<noOfElements;i++) {
        System.out.println("Enter number for index "+i);
        	number = scanner.nextInt();
        	list.add(number);
        	}
        	scanner.close();
        	ReverseArrayList obj = new ReverseArrayList();
        	System.out.println("Original List"+list);
        	list=obj.reverseList(list);
        	System.out.println("Reverse List"+list);
        }
	
	
	public ArrayList<Integer> reverseList(ArrayList<Integer> original){
		
	ArrayList<Integer> reverse = new ArrayList<Integer>();
	    for(int i=0;i<original.size();i++) {
	    
	    reverse.add(original.get(original.size()-i-1));
	    }
	    return reverse;
	}
	}