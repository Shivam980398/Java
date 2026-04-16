
import java.util.Scanner;
class BmiCalculator{

public static void main(String[] args){

         Scanner s = new Scanner(System.in);

         System.out.println("Enter your weight in KG");

         double weight = s.nextDouble();

         System.out.println("Enter your height in meter-square");

          double height = s.nextDouble();


          double BMI = weight/(height * height);
          
         if(BMI<18.5){
           System.out.println("Underweight");
         }
         else  if(BMI>=18.5 && BMI<=24.9){
           System.out.println("Normal weight");
         }else  if(BMI>=25.0 && BMI<=29.9){
           System.out.println("Over weight");
         }else  if(BMI>30.0){
           System.out.println("Obesity");
         }else{
           System.out.println("Invalid height and weight");
        }

}



}