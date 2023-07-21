package PracticeQuestions;



public class CheckArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] ar = new int[10];
		int[] ar= {1,2,3,4,5,8};
		boolean result=checkArraySort(ar);
		System.out.println(result);
		/*if(result==true) {
			System.out.println("Array is sorted");	
		}else {
		System.out.println("Array is not sorted");
		}*/
	}
	public static boolean checkArraySort(int [] ar) {
		int count=0;
		for(int i=0;i < ar.length-1;i++) {
			if (ar[i+1]>ar[i]) {
				count++;
				continue;
				
			}
			else {
				break;
			}
		}
		System.out.println(count);
		if((ar.length-1)==count) {
			return true;
		}else {
		return false;
		}
	}

}
