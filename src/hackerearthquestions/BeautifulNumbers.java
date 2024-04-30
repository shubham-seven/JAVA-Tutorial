package hackerearthquestions;
import java.util.*;
public class BeautifulNumbers {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        for(int i=0;i<t;i++){
	         
	         double x = s.nextDouble();
	         int k = s.nextInt();
	       String str = beautifulNumber(x,k);
	       System.out.println(str);

	         }
	        } 
	    
	    public static String beautifulNumber(double x, int k){
	          double val = k;
	         double update=x;
	         for(double j=0;j<update;j++){
	           if(Math.pow(k,j)==x){
	              return "YES";
	           }else if(Math.pow(k,j)>x){
	             update = j;
	             x=x-(Math.pow(k,j-1));
	             j=-1;
                 System.out.println(x);
	           }
	    }
	    if(x!=0){
	        return "NO";
	    }else{
	        return "YES";
	    }

	}

	}


