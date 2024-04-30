package hackerearthquestions;
import java.util.*;
public class PalindromicString {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
         String str = s.next();
         char[] ch = str.toCharArray();
         String finalStr = "";
         for(int i=ch.length-1;i>=0;i--){
            finalStr = finalStr + ch[i];
         }
       if(finalStr.equals(str)) {
    	   System.out.println("YES");
       }else {
		//System.out.println("NO");
    	   
	}
       
	}

}
