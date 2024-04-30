package loops;

import java.util.Scanner;

public class StrongNumber {

	public static int factorialOfNumber(int n) {
		int factorial=1;
		if(n>1) {
			for (int i = 2; i <=n ; i++) {
				factorial*=i;
			}
			return factorial;
		}else {
			return factorial;
		}
	}
	public static void main(String[] args) {

	  int sum=0;
	  System.out.println("Enter Number:");
	  Scanner sc = new Scanner(System.in);
	  int number = sc.nextInt();
	  int a=number;
	  
	  while (a!=0) {
	  int n=a%10;
	  sum=sum+factorialOfNumber(n);
	  a/=10;
	}
	  if(sum==number) {
		  System.out.println("Given Number is StrongNumber");
	  }
	  else {
		System.out.println("Given Number is Not a StrongNumber");
	}
	}

}
