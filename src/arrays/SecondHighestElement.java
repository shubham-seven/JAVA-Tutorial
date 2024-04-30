package arrays;

public class SecondHighestElement {

	public static void main(String[] args) {
		int[] ar = new int[5];
		ar[0]=15;
		ar[1]=25;
		ar[2]=100;
		ar[3]=-12;
		ar[4]=1;
		
		int highest =0;
		int si=0;
		int li=ar.length-1;
		int secondHighest=0;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[si]>=ar[li]) {
				if(secondHighest<ar[li]) {
					secondHighest=ar[li];
					}
				li--;
				highest=ar[si];
				
		}
			else {
				if(secondHighest<ar[si]) {
					secondHighest=ar[si];
					}
				si++;
				highest=ar[li];
				
			}
		}
		System.out.println("Second Highest is "+secondHighest);
	}

}
