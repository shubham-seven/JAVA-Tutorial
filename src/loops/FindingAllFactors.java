package loops;

import java.util.Scanner;

public class FindingAllFactors {

	public static void main(String[] args) {
 
		int sum=0,prod=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
	    int n =	sc.nextInt();
	    
	    for (int i = 1; i <= n; i++) {
			if (n%i==0) {
				System.out.println(i);
				sum=sum+i;
				
				prod=prod*i;
				
			}
		}
	    System.out.println(sum);
	    System.out.println(prod);
	}

}
