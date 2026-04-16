import java.util.Scanner;

class checkForVote {

       public static void main(String [] args){


        Scanner s = new Scanner(System.in);

        System.out.println("Input a age");
         int a = s.nextInt();

       if(a>=18){

         System.out.println("Eligible for vote");
      }else{
         System.out.println("Not eligible for vote");
      }
   }
  
 }