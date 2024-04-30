package loops;

import java.util.Scanner;

public class LastFourDigitSum {
	
	public static boolean sumOfLast4DigitsIsPrimeOrNot(int sum) {
		int count=0;
		for (int i = 1; i<=sum; i++) {
			if(sum%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
        
		System.out.println("Enter Employee ID:"); 
        
		Scanner sc = new Scanner(System.in);
	    int empId = sc.nextInt();
		int a=0;
		int sum=0;
		int count=0;
		while (count<4) {
			
			a=empId%10;
			sum=sum+a;
			empId/=10;
			count++;
		}
		if(sumOfLast4DigitsIsPrimeOrNot(sum)) {
			System.out.println("Last Four digit sum is prime");
		}
		else {
			System.out.println("Last Four digit sum is not prime");
		}
	}

}
