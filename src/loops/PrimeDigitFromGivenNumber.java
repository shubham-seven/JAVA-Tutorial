package loops;

import java.util.Scanner;

public class PrimeDigitFromGivenNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
	    int number = sc.nextInt();
	    

	    while (number>0) {
		int digit = number%10;
		int count=0;
		for (int i = 1; i <=digit; i++) {
			if (digit%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println("Prime Digit of Given Number is "+digit);
		}
		number/=10;
		}
	}

}
