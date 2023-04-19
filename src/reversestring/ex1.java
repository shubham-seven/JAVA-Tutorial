package reversestring;
import java.util.*;
public class ex1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string you want to reverse : ");
		String res = sc.nextLine();
	    sc.close();
		 String fin=res.trim();
		System.out.printf("Original String : %s",fin + "\n");
		String rev=reverseString(fin);
		System.out.printf("Reverse String : %s",rev);
		
		}
	
	public static String reverseString(String str){
		String tot="";
	
	      String[] arrOfStr = str.split(" ");
	      
	  	for(int i = arrOfStr.length-1;i>=0;i--) {
			// System.out.printf("\t",arrOfStr[i]);
	  		if (i==0) {
	  		tot=tot+arrOfStr[i];
	  		}else {
	  		tot=tot+arrOfStr[i]+" ";
	  		}
		}
	    return tot;
	}	
}



