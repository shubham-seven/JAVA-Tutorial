package hackerearthquestions;
import java.util.*;

public class RookAttack {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[][] ar = new int[n][m];
        long[]  rowAr = new long[n];
        long[]  colAr = new long[m];
        for(int i=0;i<n;i++){
          int rowSum=0;
          for(int j=0;j<m;j++){
             ar[i][j] = s.nextInt();
             rowSum +=ar[i][j];
             colAr[j] = colAr[j] + ar[i][j];
          }
          rowAr[i] = rowSum;
        }
        System.out.println(Arrays.toString(rowAr));
        System.out.println(Arrays.toString(colAr));
       String res = rookAttack(ar,n,m,colAr,rowAr);
       System.out.println(res);

   }

   public static String rookAttack(int[][] ar,int n,int m,long[] colAr,long[] rowAr){
       long var=0,max=0,x=0,y=0;
         for(int i=0;i<n;i++){
          
          for(int j=0;j<m;j++){
             var = colAr[j] + rowAr[i]-2*(ar[i][j]);
             System.out.println(var);
             if(var>max) {
            	 
            	 max = var;
            	 x=i;
            	 y=j;
             
           }else if(var==max) {
        	   if(x>i) {
        		   x=i;
        	   }else if(x==i && y>j) {
        		   y=j;
        	   }
           }
              
           }
   }
         return (x+1)+" "+(y+1);
	}

}
