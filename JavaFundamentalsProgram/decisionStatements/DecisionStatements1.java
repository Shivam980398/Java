import java.util.Scanner;

class DecisionStatements1 {

       public static void main(String [] args){


        Scanner s = new Scanner(System.in);

        System.out.println("Input a number");
         int a = s.nextInt();

       if(a%2==0){

         System.out.println("Number is even");
      }else{
         System.out.println("Number is odd");
      }
   }
  
 }