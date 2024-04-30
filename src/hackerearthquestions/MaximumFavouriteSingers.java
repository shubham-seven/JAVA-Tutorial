package hackerearthquestions;
import java.util.*;
public class MaximumFavouriteSingers {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
        
        
        int numberOfSongs = s.nextInt();
        
         long[] singerInteger = new long[numberOfSongs];
        for(int i=0;i<numberOfSongs;i++){
         singerInteger[i] = s.nextLong();

        }
       Arrays.sort(singerInteger);
       System.out.println(Arrays.toString(singerInteger));
       int count=0,maxCount=0,var=0;
       int maxFav=1;
       for(int j=0;j<singerInteger.length;j++){
    	  
        count=0;
        for(int k=j;k<singerInteger.length;k++){
           if(singerInteger[j]==singerInteger[k]){
             count++;
             var=k;
           }else {
        	   var=k-1;
        	   break;
           }
        }
        
        if(count>maxCount){
        	maxCount=count;
            maxFav=1;
        }else if(count==maxCount){
            maxFav++;
        }else{
            continue;
        }
          j=var;
       }
       System.out.println(maxFav);

	}

}
