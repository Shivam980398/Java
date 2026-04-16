import java.util.Scanner;

class DecisionStatements3 {

       public static void main(String [] args){


        Scanner s = new Scanner(System.in);

        System.out.println("Input a number");
         int a = s.nextInt();

       if(a>=0){

         System.out.println("Absolute number is " + a);
      }else{
         System.out.println("Absolute number is " + (-1*a));
      }
   }
  
 }