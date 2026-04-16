
import java.util.Scanner;

class methodCombine
{
   public static void m1(byte a,short s, int i, long l,double d,float f,char ch,String str, boolean b){

            System.out.println("Byte :" + a);
             System.out.println("Short :" + s);

            
            System.out.println("int :" + i);
             System.out.println("long :" + l);

              System.out.println("double :" + d);
               System.out.println("float :" + f);
 
             System.out.println("char  :" + ch);

            
            System.out.println("String :" + s);
             System.out.println("Boolean :" + b);


     
           
       }

   public static void B(byte a,byte b){

          System.out.println(b+ a);


   }

   public static void S(short a, short b){


       System.out.println(b+ a);


 }

public static void L(long a,long b){


     System.out.println(b+ a);

 }

public static void D(double a,double b){


     System.out.println(b+ a);

 }

public static void F(float a,float b){


     System.out.println(b+ a);

 }

public static void Bool(boolean a,boolean b){


     System.out.println(b && a);

 }
public static void Str(String a,String b){


     System.out.println(b+ a);

 }

public static void Ch(char a,char b){


     System.out.println(b +a);

 }
 
  public static void main(String[] args){

    m1((byte)1,(short)33,333,3333l,33.333,33.3f,'a',"Shivam Yadav",true);
    B((byte)10,(byte)20);
     S((short)10,(short)20);
     L(40,50);
    
      D(40.4,30.0);
      F(30.f,80.f);

     Bool(true,false);
     Str("SHiva","Yadav");

     Ch('a','b');
     


   
}
}