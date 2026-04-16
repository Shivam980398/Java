import java.util.Scanner;

class GreatestOfTwoNo{

  public static void main (String []args){
    
    Scanner s = new Scanner(System.in);

        System.out.println("Input First number");

    int a = s.nextInt();
    
    System.out.println("Input Second number");

    int b = s.nextInt();


    String result = a>b?"a is greater":"b is greater";
    System.out.println(result);


  }

}