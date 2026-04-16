import java.util.Scanner;
class fibSeries{

   public static void main(String [] args){
      
        Scanner s = new Scanner(System.in);
         int m = s.nextInt();
         int n = s.nextInt();


         int n1 =0;
          int n2 =1;
          int i=1;
          while(i<m){
           int n3 = n1+n2;
           
           n1 =n2;
           n2 = n3;

          i++;
         
            
        }


       while(m<=n){
         System.out.print(n1 + " ");
           int n3 = n1+n2;
           n1 =n2;
           n2 = n3;
           m++;

      }
         
   }


}