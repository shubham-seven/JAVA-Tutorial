package hackerearthquestions;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int n = s.nextInt();
		int count = 0;
		
	   char[] ch = str.toCharArray();
       for (int i = 0; i < ch.length; i++) {
		if(n==ch[i]-48) {
			count++;
		}
	}
       System.out.println(count);
	}

}
