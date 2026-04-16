import java.util.Scanner;
class PalindromeNumber{


   public static void main(String [] args){
       
       Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
     
        int n = s.nextInt();
        int original =n;
        int reversedNum =0;



       while(n>0){
        
         int digit =n%10;
         reversedNum = reversedNum*10 + digit;

         n/=10;
        


     }
       
        
      if(reversedNum == original){

         System.out.println("Number is Palindrome");

 }else{
         System.out.println("Number is not Palindrome");

  }
     
   

  }
}