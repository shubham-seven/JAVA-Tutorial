package hackerearthquestions;
import java.util.*;
public class Excursion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++){
           int b = s.nextInt();
           int g = s.nextInt();
           int k = s.nextInt();
             
          System.out.println(numberOfRooms(b,g,k));
        }  
    }
    public static int numberOfRooms(int b,int g,int k){
        int rumb=0,rumg=0,totalrums=0;
         if(b%k==0){
          rumb=b/k;
         }else{
           rumb=(b - (b%k))/k + 1;
         }
         if(g%k==0){
          rumg=g/k;
         }else{
            rumg=(g - (g%k))/k + 1;
         }
       
         totalrums = rumb+rumg;
      
         return totalrums;
    }

	}

