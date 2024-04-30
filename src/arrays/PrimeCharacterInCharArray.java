package arrays;

public class PrimeCharacterInCharArray {

	public static void main(String[] args) {
		String s = "applegC";
		char[] a = s.toCharArray();
		int [] iar = new int[a.length];
		for (int j = 0; j < a.length; j++) {
			
			iar[j]=a[j];
			
		}
	for (int i = 0; i < iar.length; i++) {
	int	count=0;
		for (int j = 1; j <=iar[i]; j++) {
			if (iar[i]%j==0) {
				count++;
			}
		}
		if (count<=2) {
			System.out.println(iar[i]+"Prime Character : "+a[i]);
			
		}
	}

	}

}
