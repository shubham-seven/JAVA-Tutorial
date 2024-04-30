package hackerearthquestions;
import java.util.*;
public class MultipleOccurences {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++){
         int x = s.nextInt();   
        long[] ar = new long[x];
        Map<Long, Integer> mp = new HashMap<Long, Integer>();
        for(int j=0;j<x;j++){
           ar[j] = s.nextLong(); 
           mp.put(ar[j], j);
        }
        int sum = 0;
      for (Long key : mp.keySet()) {
	           int count =0;
	           int lstIndex = ar.length-1;
	           int firstIndex = 0;
	//System.out.println(key);
    	  for (int k = 0; k < ar.length; k++) {
			if(key==ar[k] && count==0) {
			  firstIndex=k+1;
              count++;
              continue;
		    }else if(count>0){
              if(key==ar[lstIndex]){
                break;
              }else{
                lstIndex--;
              }
             }  
           
		}
    	  
    		  sum = sum + lstIndex+1-firstIndex;
    	  
    	 
	}
      System.out.println(sum);
        
        }
        
        
        
    }
 
	  
	}


