package hackerearthquestions;
import java.util.*;
public class NumberOfSteps {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int[] a = new int[n];
	        int[] b = new int[n];
	        int var=5000; 
	        int index = 0;
	        for(int i=0;i<n;i++){
	          a[i] = s.nextInt();
	          if(var>a[i]){
	            var=a[i];
	            index=i;
	          }
	          
	        }
	        System.out.println(Arrays.toString(a));
	        for(int j=0;j<n;j++){
	          b[j] = s.nextInt();
	        }
	        System.out.println(Arrays.toString(b));
            System.out.println(var);
            System.out.println(index);
	        while(var>0){
	        int steps=0;
	        int flag=0;
	        for(int k=0;k<n;k++){
	          int x = a[k];
	          int count=0;
	          

	          if(a[k]>var){

	              while(x>var){
	                  x=x-b[k];
	                  count++;
	                        if(x==var){
	                            steps+=count;
	                            flag++;
	                            break;
	                              }
	                            }

	                            if (x<var){
	                                break;
	                            }
	                        }else if(a[k]==var){
	                            flag++;
	                        }

	                }
	                if(flag==n){
	                    System.out.println(steps);
	                    break;
	                }else{
	                    var=var-b[index];
	                }

	        }

	}

}
