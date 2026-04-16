import java.util.Scanner;

class DecisionStatements2 {

       public static void main(String [] args){


        Scanner s = new Scanner(System.in);

        System.out.println("Input a number");
         int a = s.nextInt();

       if(a>=0){

         System.out.println("Number is positive");
      }else{
         System.out.println("Number is negative");
      }
   }
  
 }