package hackerearthquestions;
import java.util.*;

public class SumitAndRohil {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        Set<String> strings = new HashSet<>();
        
        
        
       
        
        while(n>0) {
        	 
        	StringBuilder sb = new StringBuilder();
        	String str = s.next();
            sb.append(str.charAt(0));
            String substr = str.substring(1,str.length()-1);
            char[] ch = substr.toCharArray();
            Arrays.sort(ch);
          
            sb.append(Arrays.toString(ch));
            sb.append(str.substring(str.length()-1));
            strings.add(sb.toString());
            System.out.println(sb);
            n--;
        }
        System.out.println(strings.size());
        System.out.println(strings);
        
	}

}
