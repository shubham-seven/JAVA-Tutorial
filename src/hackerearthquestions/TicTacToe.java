package hackerearthquestions;
import java.util.*;
public class TicTacToe {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        String s1 = s.next();
	        String s2 = s.next();
	        String s3 = s.next();
	      char[] pattern =  (s1+s2+s3).toCharArray();
	      char[] row2 =  s2.toCharArray();
	      char[] row3 =  s3.toCharArray();
	      int countOfX=0,countOfY=0,countOfDot = 0;
	      HashMap<Character , Integer> hMap = new HashMap<>();
	      for(int i=0;i<9;i++){
	        if(pattern[i]=='X') {
	        	countOfX++;
	        	hMap.put('X', countOfX);
	        	
	        }else if (pattern[i]=='Y') {
	        	countOfY++;
	        	hMap.put('Y', countOfY);
			}else {
				countOfDot++;
				hMap.put('.', countOfDot);
			}
	      }
	      
	       System.out.println(hMap);
	         
	    }

	}


