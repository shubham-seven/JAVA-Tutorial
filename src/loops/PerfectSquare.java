package loops;

import java.util.Scanner;

public class PerfectSquare {
	
	public static boolean numberIsPerfectSquareOrNot(int n) {
		if(n>=4) {
			for (int i = 2; i <=n/2; i++) {
			int	ps = i*i;
			if (ps==n) {
				return true;
			}else if (ps>n) {
				return false;
			}
			}
			return false;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (numberIsPerfectSquareOrNot(n)) {
			System.out.println("Number is perfect square");
		}else {
			System.out.println("Number is not a perfect square");
		}
		
	}

}
