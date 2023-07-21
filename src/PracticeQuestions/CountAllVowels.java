package PracticeQuestions;

public class CountAllVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountAllVowels obj = new CountAllVowels();
		int result=obj.countVowels("w3resource");
		System.out.println(result);
	}
	public int countVowels(String str) {
		int count=0;
		if(str.length()>=3) {
			
		
		for (int i=0;i<str.length();i++) {
		
			if(str.substring(i,i+1).equals("a") || str.substring(i,i+1).equals("e") || str.substring(i,i+1).equals("i") || str.substring(i,i+1).equals("o") || str.substring(i,i+1).equals("u")){
				count++;
			}
		}
		return count;
	}
		return count;
	}
}
