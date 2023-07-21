package PracticeQuestions;

public class ValidPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ValidPassword obj = new ValidPassword();
		obj.vp("shubham1nfklsjlkf");
	}

	public void vp(String psw) {
		int count=0;
		if (psw.length()>=10) {
			for(int i=0;i<psw.length();i++) {
				if((psw.charAt(i)>=48 && psw.charAt(i)<=57) || (psw.charAt(i)>=65 && psw.charAt(i)<=90) || (psw.charAt(i)>=97 && psw.charAt(i)<=122) ) {
				if(psw.charAt(i)>=48 && psw.charAt(i)<=57) {
					count++;
					}
				}
				}
			if(count>=2) {
			System.out.println("Password is valid: "+psw);
			}
			else {
				System.out.println("Password is invalid: "+psw);
			}
			
			
		}
		
	}
}
