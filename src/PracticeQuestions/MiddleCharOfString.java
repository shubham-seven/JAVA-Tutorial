package PracticeQuestions;

public class MiddleCharOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiddleCharOfString obj = new MiddleCharOfString();
		System.out.println(obj.middleCharacter("Nilesh"));

	}
	public String middleCharacter(String s) {
		
		if(s.length()>=3) {
			if(s.length()%2==0) {
				return s.substring(s.length()/2,s.length()/2 +2);
			}else {
				return s.substring(s.length()/2,s.length()/2 +1);
			}
		}
		
		return s;
		
		}

}
