package patterns;

public class PatternAlphabet1 {

	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			
		int x=i;
		
		for (char ch = 'A'; ch <='E' ; ch++) {
			
			if(6-x>0) {
				System.out.print(ch+" ");
				x++;
			}
			
		}

		System.out.println();
		}
	}

}
