package PracticeQuestions;

import java.util.Scanner;

public class ArrayCountOdd {
	static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements array");
	    	n = sc.nextInt();
	    int arr[] = new int[n];
	    
	    for(int i=0;i<n;i++) {
	    	
	    	System.out.println("Enter the number");
		    arr[i] = sc.nextInt();
	    }
	    
	    System.out.println("Number of odd numbers:"+countOdd(arr));
	    
	   String ar[] = returningStringArray(arr);
	   
	  for (String str : ar) {
		System.out.println(str);
	}
	   

	}
public static int countOdd(int arr[]) {
	int count=0;
	for(int i=0;i<n;i++) {
		if(arr[i]%2!=0) {
			count++;
		}
	}
	return count;
}
public static String[] returningStringArray(int arr[]) {
	String ar[] = new String[n];
	
	for(int i=0;i<arr.length;i++) {
		ar[i]=String.valueOf(arr[i]);
	}
	return ar;
}
}
