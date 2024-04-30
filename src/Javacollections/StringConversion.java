package Javacollections;
import java.util.*;

public class StringConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            String s = sc.next();
            String p = sc.next();
            char[] chs = s.toCharArray();
            char[] cht = p.toCharArray();
            ArrayList<Character> al1 = new ArrayList<Character>(n);
	         ArrayList<Character> al2 = new ArrayList<Character>(n);
          for(int j=0;j<n;j++){
          al1.add(chs[j]);
          al2.add(cht[j]);
        }
          Collections.sort(al1);
	         Collections.sort(al2);

          String ans =  matrix(al1,al2,n);
          System.out.println(ans);
  }    
}
public static String matrix(ArrayList al1,ArrayList al2,int n){
    
          System.out.println(al1);
          System.out.println(al2);
          int res=0;int x=0;
          for (int k = 0; k < n; k++) {
        	  
			if(al1.get(k).equals('?')) {
				res++;
				
			}else {
			int count=0;
			for(int f=x;f<n;f++) {
				
			if(al1.get(k)==al2.get(f)) {
				x=f+1;
				count++;
				res++;
				break;
			}
		}
	 } 
        
} 
          if(res==n) {
	  return "Yes";
}else {
	return "No";
}

	}
}
