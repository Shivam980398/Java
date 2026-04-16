import java.util.Scanner;

class ScannerMethod {

     public static void main(String []args){


      Scanner s = new Scanner(System.in);
       String name = s.next();
       System.out.println(name);

       String fullname = s.nextLine();
            System.out.println(fullname);



       int n = s.nextInt();
       System.out.println(n);
       


            double d = s.nextDouble();
       System.out.println(d);
       

          boolean b = s.nextBoolean();
       System.out.println(b);

         char ch = s.next().charAt(0);
          System.out.println(ch);
}

}