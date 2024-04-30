package hackerearthquestions;
import java.util.*;
public class SpecialNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int  t = s.nextInt();

        for(int i=0;i<t;i++){
           int a = s.nextInt();
         int res =  specialNumber(a);
         System.out.println(res);
        }
   }
   
    public static int specialNumber(int a){
    int s=0;
    do{
    int sum=0,n=a;
    while(n>0){
    int var = n%10;
    n/=10;
    sum += var;
    }
    s=sum;
    
    if(sum%4==0){
      return a;
    }else{
      a++;
    }
    
 }while(s%4!=0);
  return a;
 }

}
