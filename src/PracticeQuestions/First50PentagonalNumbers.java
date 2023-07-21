package PracticeQuestions;

public class First50PentagonalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		First50PentagonalNumbers obj = new First50PentagonalNumbers();
		obj.pentagonalNumbers();
	}
	
	public void pentagonalNumbers() {
		
		
		for(int n=1;n<=50;n++) {
			
			System.out.print( (3*n*n-n)/2 +"\t");
			if(n%10==0) {
				System.out.println("");
			}
		}
	}

}
