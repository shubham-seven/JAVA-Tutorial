package hackerearthquestions;
import java.util.*;
public class MaximumBorders {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        
		 
	        
	        int testCases = s.nextInt();
	        
	        for (int magic = 1; magic <= testCases ; magic++) {
	        	int border = 0;
			
	        int n = s.nextInt();
	        int m = s.nextInt();
	        char[][] table = new char[n][m];
	        int borderRow=0,br=0;
	        for(int i=0;i<n;i++){
	          String str = s.next();
	         char[] ch = str.toCharArray();
	        int count=0;
	         for(int j=0;j<m;j++){
	            table[i][j] = ch[j];
	            if(ch[j]=='#'){
	                count++;
	                if(borderRow<count){
	                  borderRow=count;
	                }
	             
	             }else{
	                count=0;
	             }
	         }
	         if(borderRow>br){
	          br=borderRow;
	         }
	        }
	        
	        int borderCoulumn=0,bc=0;
	       
	        for (int i = 0; i < m; i++) {
				int count=0;
	        	for (int j = 0; j < n; j++) {
	        		if(table[j][i]=='#'){
		                count++;
		                if(borderCoulumn<count){
		                	borderCoulumn=count;
		                }
		             
		             }else{
		                count=0;
		             }
				}
	        	if(borderCoulumn>bc){
	  	          bc=borderCoulumn;
	  	         }
			}
	        
            if(bc>br) {
            	border=bc;
            }else {
				border=br;
			}
            System.out.println(border);
	        }
	}

}
