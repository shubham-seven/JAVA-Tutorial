package PracticeQuestions;

public class CountAllWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	count = countWords("shubham");
	System.out.println(count);
	}
	
	public static int countWords(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			count++;
			
		}
		return count;
	}

}
