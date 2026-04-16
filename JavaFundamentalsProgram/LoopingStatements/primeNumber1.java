import java.util.Scanner;
class primeNumber1{


   public static void main(String [] args){
       
       //Scanner s = new Scanner(System.in);

        //System.out.println("Enter a number");
     
        int n =10;      

        int j =2;
        int i=2;
        int count =0;
        while(i<=n){

       
        if(i%j == 0){
          j++;
        count++;
       }
        if(j==i){
           
           if(count==1){

            System.out.println(i);
           i++;
           j=2;
          count =0;

          }
        }
        
       
         

       }
     }      
      
  

  }
