import java.util.Scanner;
class GradingSystem{
   
     public static void main(String [] args){


      Scanner s = new Scanner(System.in);


       System.out.println("Enter your number to check your grade");

       int number  = s.nextInt();

        if(number>=90 && number<=100){

          System.out.println("Your grade is A");

      }else if(number>=75 && number<90){

          System.out.println("Your grade is B");

      }else if(number>=60 && number<75){

          System.out.println("Your grade is C");

      }else if(number>=35 && number<60){

          System.out.println("Your grade is D");

      }
      else if(number<35)
     {          
         System.out.println("Your grade is F  ");
        }


}
  
}