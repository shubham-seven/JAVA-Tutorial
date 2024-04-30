package hackerearthquestions;
import java.util.*;
public class SimonCantSleep {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String timeFormat = s.nextLine();
        
      

      char[] ch = timeFormat.toCharArray();
      
         int hour = ch[0] -48;
         hour=hour*10;
         hour = hour + ch[1] -48;
         int minutes = ch[3] -48;
         minutes=minutes*10;
         minutes = minutes + ch[4] -48;
         
         
         
         int overlap = 1;
        
         overlap = overlapTimes(overlap,hour,minutes);
         
         System.out.println(overlap);
         
	}
         public static int overlapTimes(int overlap,int hour,int minutes) {
        	 if(hour==23 || hour==0) {
            	 if(hour==23) {
            		 return 22;
            	 }else if(hour==0){
    				return 1;
    			}
             }
	     double totalMinutes = hour*60 + minutes ;
	     
	    double var1 = (totalMinutes*6)%360;
	    double var2 =  totalMinutes/2.0;
	    if(var2>=360) {
	    	var2=var2-360;
	    }
	     if(var1>=var2) {
	    	 if (hour<12) {
			return hour+1;
	    	 }else if(hour==12){
				return hour;
			}else {
				return hour;
			}
	     }else {
	    	 if (hour>12) {
				return hour-1;
			}else {
				return hour;
			}
	    	 
	     }
}
}
