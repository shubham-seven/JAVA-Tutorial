package hackerearthquestions;

import java.util.Scanner;

public class NumberOfSubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = s.next().charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = i; j < str.length(); j++) {
				String subString = str.substring(i, j+1);
				if(str.charAt(i)==ch && str.charAt(subString.length()-1)==ch) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
