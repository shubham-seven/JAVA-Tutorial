package PracticeQuestions;

import java.util.Scanner;

public class TwinPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Enter number between 10 to 1000 to get co prime numbers till there: ");
Scanner sc =  new Scanner(System.in);
int n=sc.nextInt();
TwinPrimeNumbers obj = new TwinPrimeNumbers();
obj.twinPrimeNumber(n);
sc.close();

	}
	
	public void twinPrimeNumber(int n) {
		int k=3;
		if (n>=10 && n<=1000) {
			
		for (int i=3;i<=n;i++) {
			int count=0;
			if(i%2!=0 && i+2<=n) {
				
				for(int j=2;j<i;j++) {
					if(i%j==0) {
					count++;
					break;
					}
				}
				if(count<1 ) {
					if(k+2==i) {
					System.out.println("("+k+","+i+")");
						
					}
					k=i;
					}
				
				}
	       }
		}else {
		System.out.println("Invalid Number");
		}
	}

}
