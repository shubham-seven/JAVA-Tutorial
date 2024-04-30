package arrays;

public class PrintEvenIndexOfArray {

	public static void main(String[] args) {
		
		int [] ar = new int[6];
		
		ar[0]=67;
		ar[1]=98;
		ar[2]=78;
		ar[3]=32;
		ar[4]=6;
		ar[5]=10;
		
		for (int i = 0; i < ar.length; i++) {
			if(i%2==0) {
				System.out.println("Even Index :"+i+" with value:"+ar[i]);
			}
		}

	}

}
