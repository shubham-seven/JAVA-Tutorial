package PracticeQuestions;

public class AverageOfThreeNumbers {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AverageOfThreeNumbers obj = new AverageOfThreeNumbers();
		System.out.println(obj.average(25, 45, 60));

	}
	
	public double average(int a,int b,int c) {
		 double avg = (a+b+c)/3.0 ;
		 return avg;
	}

}
