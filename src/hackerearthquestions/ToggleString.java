package hackerearthquestions;
import java.util.*;
public class ToggleString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String str = s.next();

       char[] ch = str.toCharArray();
       for(int i=0;i<ch.length;i++){
          if(ch[i]>=65 && ch[i]<=90){
          ch[i] =(char) (ch[i]+32);

          }else{
            ch[i] = (char) (ch[i]-32);
          }
          System.out.print(ch[i]);
       }

	}

}
