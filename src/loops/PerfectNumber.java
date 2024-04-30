package loops;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
	    int n =	sc.nextInt();
	    
	    for (int i = 1; i < n; i++) {
			if (n%i==0) {
				System.out.println(i);
				sum=sum+i;
			}
	}
	    if (sum==n) {
			System.out.println("Number is perfect");
		}else {
			System.out.println("Not a perfect number");
		}

	}
	}
