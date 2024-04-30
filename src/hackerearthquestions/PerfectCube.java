package hackerearthquestions;
import java.util.*;
import java.lang.Math;
public class PerfectCube {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt(); 
	        
	        int[] ar = new int[n];

	        for(int x=0;x<n;x++){
	          ar[x] = s.nextInt();
	        }
	       int count=0; 
	       for(int i=0;i<n;i++){
	         int update=n;
	         while(update>i){
	            long agrProduct = 1l;
	         for(int j=i;j<update;j++){
	          
	          agrProduct*=ar[j];
	         } 
	        double cubeRoot = Math.cbrt(agrProduct);         
	        long nearestInteger = Math.round(cubeRoot);         
	      if(nearestInteger * nearestInteger * nearestInteger == agrProduct){
	            count++;
	      }
	        update--;
	        }

	        }  
	        System.out.println(count);

	}

}
