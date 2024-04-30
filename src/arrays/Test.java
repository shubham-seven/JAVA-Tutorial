package arrays;
import java.util.*;
public class Test {

	
	    public static void main(String args[] ) throws Exception {
	     

	        // Write your code here

	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter number of songs in your playlist.");
	        int numberOfSongs = s.nextInt();
	        
	         int[] singerInteger = new int[numberOfSongs];
	        for(int i=0;i<numberOfSongs;i++){
	            System.out.println("Enter integer denoting the singer");
	           singerInteger[i] = s.nextInt();

	        }
	        System.out.println(Arrays.toString(singerInteger));
	        
	        int flag=1,val=0;
	        for (int i = 0; i < singerInteger.length; i++) {
	        	 int count=0;
	        	for (int j = 0; j < singerInteger.length; j++) {
					if (singerInteger[i]==singerInteger[j]) {
						count++;
					}
				}
	        	
	        	if (count>val) {
					val=count;
					flag=1;
				}
	        	else if (val==count) {
					flag++;
				}
			}
	        System.out.println("Number of Favourite singers: "+flag);
	    }
	}


