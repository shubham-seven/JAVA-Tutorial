package PracticeQuestions;

public class ArrayQuestion {
	

	public static void main(String[] args) {
		int [] nums = new int[4];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 1;
		nums[3] = 4;

		 String str1="";
		  String str2="";
		  
		  for(int i=0;i<nums.length;i++){
			    str1= str1 + nums[i];
			    str2=nums[i]+str2;
			  }
		System.out.println(str1);
		System.out.println(str2);


	}

}
