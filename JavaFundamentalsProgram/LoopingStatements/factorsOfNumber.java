import java.util.Scanner;
class factorsOfNumber{


   public static void main(String [] args){
       
       Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
     
        int n = s.nextInt();
      


        for(int i=1;i*i<=n;i++){


        if(n%i == 0){

           System.out.println(i);
           System.out.println(n/i);

       }
     }      
        
     

  

  }
}