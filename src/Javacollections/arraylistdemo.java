package Javacollections;


import java.util.ArrayList;


public class arraylistdemo {
	
		public static  void main(String[] args) {
		
 //java.util.ArrayList<String> aStrings = new java.util.ArrayList<String>() ;
			ArrayList<String> arr1 = new ArrayList<String>(4);  
			//Length of the array list we can pass in brackets
			arr1.add("Shubham");
			arr1.add("Trivedi");
			arr1.add("Sumit");
			arr1.add("Talreja");
           
      System.out.println(arr1.get(3));
      System.out.println(arr1.size());
      System.out.println(arr1.remove(3));
      System.out.println(arr1);
     
      //Iteration over arraylist
      for (int i=0;i<arr1.size();i++) {
    	  System.out.printf("Value at index %d is %s \n", i,arr1.get(i));
      } 
      
      //Another way to iterate
      

      for (String str : arr1) {
    
    	  System.out.printf("Value at index %d is %s \n",arr1.indexOf(str),str);
    	  
      }


	}

}
