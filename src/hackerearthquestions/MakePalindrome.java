package hackerearthquestions;
import java.util.*;
public class MakePalindrome {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int t = s.nextInt();  
	        
	       for (int i = 0; i < t; i++) {
			
	    	   int length = s.nextInt();
	    	   String str = s.next();
	    	 System.out.println(minCostToPalindrome(str));
	    	   
		}
	       

	}
	
	 public static int minCostToPalindrome(String s) {
	        // Count the frequency of each character
	        Map<Character, Integer> freq = new HashMap<>();
	        for (char c : s.toCharArray()) {
	            freq.put(c, freq.getOrDefault(c, 0) + 1);
	        }
	        

	        // Calculate the total cost
	        int totalCost = 0;
	        for (int count : freq.values()) {
	            if (count % 2 != 0) {
	                totalCost++;
	                
	            }
	        }
	        if(totalCost>0) {
	        	return totalCost-1;
	        }

	        return totalCost;

	        
	    }


}
