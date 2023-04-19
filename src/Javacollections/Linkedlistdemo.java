package Javacollections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlistdemo {

	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> lList = new LinkedList<Integer>();
		
		
		runDuration(aList,"Array List");
		runDuration(lList,"Linked List");
		
	}

		public static void runDuration(List<Integer> list,String listType) {
			
			
			System.out.println("Beginning of the duration for "+ listType);
			long startTime = System.currentTimeMillis();
			
			for (int i=0;i<100000;i++) {
				list.add(i);
				
			}
			
			long endTime = System.currentTimeMillis();
			long duration = endTime - startTime;
			System.out.println("Duration of the "+ listType + " is " + duration + "ms");
		}
	}


