package PracticeQuestions;

import java.util.Scanner;

public class FactorOfGivenNumber {

	public static void main(String[] args) {
        
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=n;
	    for (int i = 2; i <=n/2 ; i++) {
	    
			while(m%i==0) {
				
				System.out.println(i);
				m=m/i;
			}
		}
	}

}
