package patterns;

public class PatternStar7 {

	public static void main(String[] args) {
for (int i = 1; i <=5 ; i++) {
			
			for (int j = 1; j <=5 ; j++) {
				if ((i==1 || i==5) && (j!=1 && j!=5)) {
					System.out.print("* ");
				}else if ((i==2 || i==4) && (j!=2 && j!=4)) {
					System.out.print("* ");
				}else if (i==3 && j!=3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
	}
        System.out.println();
}


	}

}
