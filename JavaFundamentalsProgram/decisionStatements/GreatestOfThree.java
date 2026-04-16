import java.util.Scanner;
class GreatestOfThree {

       public static void main(String [] args){

         Scanner s = new Scanner(System.in);

         System.out.println("Input number A");


         int a = s.nextInt();
             System.out.println("Input number B");
         int b = s.nextInt();

            System.out.println("Input number C");
         int c = s.nextInt();


       if(a>b && a>c){

         System.out.println("A is greater");
      }else if(b>c){
         System.out.println("B is greater");
      }else{
        
          System.out.println("C is greater");


    }
   }
  
 }