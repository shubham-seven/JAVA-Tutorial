package hackerearthquestions;
import java.util.*;
public class LargestNumber {

	public static void main(String[] args) {
		

       
        

        // Write your code here

        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long k = s.nextLong();

        ArrayList<Integer> al = new ArrayList<Integer>();
        while(n>0){
       int var = (int)(n%10);
       n/=10;
       al.add(var);
        }        
        int max = al.get(0);
        int ind = 0;
         
         for (int i = 0; i <al.size() ; i++) {
		 
		if(max<al.get(i)) {
			max=al.get(i);
			ind=i;
		}
		}
         System.out.println(max);
	}

}
