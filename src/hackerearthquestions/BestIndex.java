package hackerearthquestions;
import java.util.*;
public class BestIndex {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        long[] a = new long[n];
	        long[] aggregateSum = new long[n];
	        long var = 0;
	        long specialSum = Long.MIN_VALUE;
	        for(int i=0;i<n;i++){
	          a[i] = s.nextLong();
	          var+=a[i];
	          aggregateSum[i]=var;
	        }
	   //  System.out.println(Arrays.toString(a));
	   //  System.out.println(Arrays.toString(aggregateSum));
	       for(int j=0;j<n;j++){
	          long sum = 0;
	          int constant = 2;
	          int end = j; 
	        while(end<n-1){
	           
	          end += constant;
	          if(end>n-1){
		            end = end - constant;
		            break;
		         }
	          constant++;
	         
	        }
	       
	        sum = aggregateSum[end] - aggregateSum[j] + a[j] ;
	        if (sum>specialSum){
	            specialSum = sum;
	        }
         
      
	       } 
	       System.out.println(specialSum); 

	}

}
