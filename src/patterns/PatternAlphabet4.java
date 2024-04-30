package patterns;

public class PatternAlphabet4 {

	public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
			
			int x=i;
			int y=1;
			for (char ch = 'A'; ch <='E' ; ch++) {
				
				
				
				if(i%2==0) {
					
					if (x>0) {
						System.out.print(ch+" ");
						x--;
					}
				}else {
					if(y<=x) {
						System.out.print(y+" ");
						y++;
					}
				}
				
			}

			System.out.println();
	}

}
}
