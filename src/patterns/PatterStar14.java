package patterns;

public class PatterStar14 {

	public static void main(String[] args) {
	/*	
		int countOdd=0,countEven=0;
		for (int i = 1; i <=11; i++) {
			if(i%2!=0) {
				
			for (int j = 1; j <=11; j++) {
				 
					if (j>=6-countOdd && j<=6+countOdd ) {
						System.out.print("* ");
						
						}else {
						System.out.print("  ");
						
						}
		           }
			countOdd++;
			}
			else {
				for (int k = 1; k <=11; k++) {
					if (k>=5-countEven  && k<=6+countEven) {
						System.out.print(" *");
						
					}else {
						System.out.print("  ");
					}
				}
				countEven++;
		    }
			
	    
			System.out.println();
		}
*/
		
		int n=11;
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
		if(i+j>=n+1) {
		System.out.print("* ");
		}
		else {
		System.out.print(" ");
		}
		}
		System.out.println();
		}

	}
	

}
