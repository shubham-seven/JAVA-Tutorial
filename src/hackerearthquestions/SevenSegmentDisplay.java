package hackerearthquestions;
import java.util.*;

public class SevenSegmentDisplay {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	HashMap<Long,Long> hm = new HashMap<Long,Long>();
	          hm.put(0l, 6l);
	          hm.put(1l, 2l);
	          hm.put(2l, 5l);
	          hm.put(3l, 5l);
	          hm.put(4l, 4l);
	          hm.put(5l, 5l);
	          hm.put(6l, 6l);
	          hm.put(7l, 3l);
	          hm.put(8l, 7l);
	          hm.put(9l, 6l);
	          
	          
	        for(long i=0;i<t;i++){
	        long   n = s.nextLong();
	         long  x = n;
	          if(n==0) {
	        	  System.out.print("111");
	          }else {
	          long sum=0;
	          while(x>0){
	        	  long digit = x%10;
	           long  val = hm.get(digit);
	             sum+=val;
	            x/=10;
	          }
	         
	          long maxNumber=0;
	          if(sum%2==0){
	            maxNumber = sum/2;
	           for(long j=0;j<maxNumber;j++){
	              System.out.print("1");           
	            }
	          }else{
	          maxNumber=(sum-3)/2;
	         
	            System.out.print("7"); 
	            for(long j=0;j<maxNumber;j++){
	                System.out.print("1");           
	              }
	          }
	          System.out.println();
	        }
	        }
	}

}
