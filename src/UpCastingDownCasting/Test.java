package UpCastingDownCasting;

public class Test {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		//(valid for Multi Level Inheritance)Very Important if we have upcasted the last child
		//with the uppermost parent all instance of will come true
		
		A obj = new C();
		System.out.println(obj instanceof C);
		System.out.println(obj instanceof B);
		
	}

}
