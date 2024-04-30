package Exceptionhandling;

public class ArithmeticExceptionDemo {
	
	public static void div() {
		int a=10;
		int b=0;
		try {
		int res=a/b;
		}catch (ArithmeticException e) {
			System.out.println("Above Exception Handled");
		}catch (Exception e) {
			System.out.println("xyz");
		}
		
	}

	public static void main(String[] args){
/*
		try {
			div();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	
		div();
		
		System.out.println("Above Exception Handled");
	}

}
