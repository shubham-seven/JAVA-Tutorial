package patterns;

public class PatternStar11 {

	public static void main(String[] args) {
		
		for (int i = 0; i <=4 ; i++) {
			int x=i;
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
