package arrays;

import java.util.Arrays;

public class StringToIntegerArray {

	public static void main(String[] args) {
		
		String s = "apple";
	char[] a = s.toCharArray();
	int [] iar = new int[a.length];
	for (int j = 0; j < a.length; j++) {
		
		iar[j]=a[j];
		
	}
	System.out.println(Arrays.toString(iar));
	
	}

}
