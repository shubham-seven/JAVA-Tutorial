package PracticeQuestions;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigits obj = new SumOfDigits();
		int res=obj.sumOfDigits(37890567);
		System.out.println(res);
	}
	
	public int sumOfDigits(int number) {
	int sum=0;	
	if(number/10 !=0) {
	while (number/10 !=0) {
		int digit=number%10;
		number=number/10;
		sum = sum + digit;
	}
	return sum+number;
	}
	return number;
	}

}
