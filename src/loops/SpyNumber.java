package loops;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
        int sum =0;
        int product=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
	    int n =	sc.nextInt();
	    
	   while (n>0) {
	   int x =	n%10;
	   sum+=x;
	   product*=x;
	   n/=10;
	}
	   if(sum==product) {
		   System.out.println("Number is Spy");
	   }else {
		   System.out.println("Not a SpyNumber");
	}
	   
	}

}
