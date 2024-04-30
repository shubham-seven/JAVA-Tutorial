package patterns;

public class PatternZeroOne {

	public static void main(String[] args) {

		for (int i = 1; i <=5 ; i++) {
			
			for (int j = 1; j <=5; j++) {
				if ((i+j)%2!=0) {
					System.out.print("1");
					System.out.print("\t");
				}else {
					System.out.print("0");
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}
	}

}
