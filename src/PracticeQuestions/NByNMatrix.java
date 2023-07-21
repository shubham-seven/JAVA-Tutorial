package PracticeQuestions;

import java.util.Scanner;

public class NByNMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.print("Please Enter matrix value: ");
      int n=sc.nextInt();
      NByNMatrix obj = new NByNMatrix();
      obj.matrix(n);
      sc.close();
	}
	
   public void matrix(int n) {
	 int j=1;
		for(int i=1;i<=n*n;i++) {  
			System.out.print(j);
			if(i%n==0) {
				System.out.println("");
				j=0;
			}
			j++;
	   }
		}
}
   

