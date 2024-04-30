package arrays;

public class SmallestElement {

	public static void main(String[] args) {
		
		int[] ar = new int[5];
		ar[0]=15;
		ar[1]=25;
		ar[2]=100;
		ar[3]=-12;
		ar[4]=1;
		String str = "Shubham";
		char[] ar1 = str.toCharArray();
		
		System.out.println(ar1[1]);
		int smallest=0;
		int	si=0;
		int li=ar.length-1;
		
		
		for(int i=0;i<ar.length-1;i++) {
		
		
		if(ar[si]<=ar[li]) {
			li--;
			smallest=ar[si];
		}
		else {
			si++;
			smallest=ar[li];
		}
		
		}
		System.out.println("Smallest Number is "+smallest);
	}

}
