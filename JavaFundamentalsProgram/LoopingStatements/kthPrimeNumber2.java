import java.util.Scanner;
class kthPrimeNumber2{


   public static void main(String [] args){
       
       Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
     
        int n = s.nextInt();

 System.out.println("Enter kth number");

       
        int k = s.nextInt();
      
          
          int i=2;
         for(;i<=n;i++){
           
           int count =0;

          for(int j=1;j<=n;j++){

          if(i%j == 0){

          count++;
         

       }
     }   
       if(count == 2){
           k--;
        
     }  
     if(k<=0){
     System.out.println(i);
     break;  
   } 
     
        
}   
  

  }
}