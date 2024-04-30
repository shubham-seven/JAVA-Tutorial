package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int count=0,prod=1;
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
	    int n =	sc.nextInt();
	    int x=n;
	    
	    while (x>0) {
	    	count++;
	    	if(count>1) {
	    		prod=prod*10;
	    	}
			x/=10;
		    
		}
	    x=n;
	    
	   /* while (x>0) {
		int y =	x%10;
		num = (int) (num + y*Math.pow(10, count-1));
		count--;
		x/=10;
		}
		*/
	    while (x>0) {
	    	int y =	x%10;
	    	num = num + y*prod;
	    	prod/=10;
	    	x/=10;
		}
	   System.out.println(num);
	if(n==num) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
	}

}
