package PracticeQuestions;



public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Years \t\t FutureValue\n");
CompoundInterest obj = new CompoundInterest();
obj.cI(1000);
	}
	
	public void  cI(int investment) {
		float p=investment;
		for(int i=1;i<=5;i++) {
			p=p+p/10.0f;
			System.out.println(i+" \t\t "+p);
		}
	}

}
