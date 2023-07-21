package PracticeQuestions;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Please Enter Year");
      int year=sc.nextInt();
      LeapYear obj = new LeapYear();
      boolean res=obj.lp(year);
      System.out.println(res);
      sc.close();
	}

	public boolean lp(int year) {
		if(year%4==0) {
			return true;
		}
		return false;
	}
}
