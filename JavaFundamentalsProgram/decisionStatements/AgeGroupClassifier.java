
import java.util.Scanner;
class AgeGroupClassifier{

public static void main(String[] args){

         Scanner s = new Scanner(System.in);

         System.out.println("Enter the age");

         int age = s.nextInt();
          
         if(age<1){
           System.out.println("Infant");
         }
         else  if(age>1 && age<=12){
           System.out.println("Child");
         }else  if(age>=13 && age<=19){
           System.out.println("Teen");
         }else  if(age>=20 && age<=64){
           System.out.println("Adult");
         }else  if(age>64){
           System.out.println("Senior");
         }else{
           System.out.println("Invalid Age");
        }

}



}