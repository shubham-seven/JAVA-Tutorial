package intro;

import java.util.Scanner;

public class Hello {

	int b;
	static int c=11;
	static Hello h1 = new Hello(c);
	public static void main(String[] args) {
        int b=5;
        c=15;
		System.out.println("\\\\Hello\\\\");
		System.out.println(b);
		Hello obj = new Hello(5);
		System.out.println(h1.b);
		
		//Scanner scanner = new Scanner(System.in);
		
		
	}

	public Hello(int b) {
	final	int a=10;
	
		this.b=b;
		System.out.println(b);
		
	}
}
