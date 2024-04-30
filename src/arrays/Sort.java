package arrays;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {

		int[] ar = new int[5];
		
		ar[0]=15;
		ar[1]=25;
		ar[2]=100;
		ar[3]=-12;
		ar[4]=1;
		
		
		for(int i=0;i<ar.length-1;i++) {
			int x=0;
			
			for(int j=i+1;j<ar.length;j++) {
			if(ar[j]<ar[i]) {
				x=ar[i];
				ar[i]=ar[j];
				ar[j]=x;
			}
			
			}
		}
		System.out.println(Arrays.toString(ar));
	}

}
