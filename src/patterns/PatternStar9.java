package patterns;

public class PatternStar9 {

	public static void main(String[] args) {
		
for (int i = 1; i <=5 ; i++) {
	int x=5-i;
			for (int j = 1; j <=5 ; j++) {
				
				if (x>0) {
					System.out.print("  ");
					x--;
				}else {
					System.out.print("* ");
				}
				
		}
			System.out.println();
	}


	}

}
