import java.util.Scanner;
class primeNumber2{


   public static void main(String [] args){
       
       Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
     
        int n = s.nextInt();
      

         for(int i=2;i<=n;i++){
           
           int count =0;

          for(int j=1;j<=n;j++){

          if(i%j == 0){

          count++;
         

       }
     }   
       if(count == 2){
      System.out.println(i);
        
     }  
  
}    
       
      
  

  }
}