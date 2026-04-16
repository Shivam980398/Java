import java.util.Scanner;
class Test2{


   public static void main(String [] args){
       
       Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
     
        int n = s.nextInt();
        int count =0;



      for(int i=n;i>0;i/=10){
        
         int digit =i%10;
          count++;

        // i/=10;
        


     }
       
        
     

     System.out.println(count);

  }
}