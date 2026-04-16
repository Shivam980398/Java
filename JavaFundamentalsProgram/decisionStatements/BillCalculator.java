
import java.util.Scanner;
class BillCalculator{

public static void main(String[] args){

         Scanner s = new Scanner(System.in);

         System.out.println("Enter the your electricity consumption");

         int c = s.nextInt();

         
          
         if(c<=100){

           System.out.println("Bill is" + c*0.50 + "Unit");
         }
         else  if(c>100 && c<=200){
           System.out.println("Bill is " + c*0.75 + "Unit");
         }else  if(c>200 && c<=300){
           System.out.println("Bill is" + c*1.20 + "Unit");
         }else  if(c>300){
           System.out.println("Bill is " + c*1.50 + "Unit");
         }else{
           System.out.println("Invalid Consumption");
        }

}



}