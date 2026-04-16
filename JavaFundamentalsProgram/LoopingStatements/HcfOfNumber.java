import java.util.Scanner;
class HcfOfNumber{

   public static void main(String [] args){
      
        Scanner s = new Scanner(System.in);
         int a = s.nextInt();

         int b = s.nextInt();
         
 
         int min = (a>b)?b:a;
         int max = (a>b)?a:b;
        while(max%min !=0){

           int max1 = max;
           max = min;
          if(max1%min >0){
          min = max1%min;
          }
         
            
        }
          System.out.println(min);
   }


}