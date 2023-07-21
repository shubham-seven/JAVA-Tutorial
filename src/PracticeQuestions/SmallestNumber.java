package PracticeQuestions;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestNumber obj = new SmallestNumber();
	int	smallestNo =obj.smalletNumberMethod(25,37,29);
	//we need to call non-static method inside static main method using object of class
	System.out.println(smallestNo);

	}
	public int smalletNumberMethod(int a,int b,int c) {
		
		return (a<=b && a<=c)?a:((b<=c && b<=a)?b:c);
	}

}
