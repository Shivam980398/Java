class typeProg{
   
   public static void main(String [] arg){



     //widening

    //Byte to all
    byte b = 2;
    short s = b;
    int  i = b;
    long l = b;
    double d= b;
   
    float f =b;
     char c = (char)b;
      
      System.out.println("Byte to all");
     
     System.out.println(b);
     System.out.println(s);
     System.out.println(i);
     System.out.println(l);
     System.out.println(f);
     System.out.println(d);
    //short to all

     short s1 = 4;
     int i1 = s1;
     long l1 = s1;
     double d1 = s1;
     float f1 = s1;
      char c1 = (char)s1;

      System.out.print("short to all");


       
     System.out.println(s1);
     System.out.println(i1);
     System.out.println(l1);
     System.out.println(f1);
     System.out.println(d1);
     
       // int to all
     
      int i2 = 97;
      long l2 = i2;
      double d2 =i2;
      float f2 = i2;

       
     System.out.print("int to all");

        
     System.out.println(i2);
     System.out.println(l2);
     System.out.println(f2);
     System.out.println(d2);
     
        

       //  long to all
      long l3 = 34632647674l;
      double d3 = l3;
       float f3 = l3;

       System.out.print("long to all");

     System.out.println(l3);
     System.out.println(f3);
     System.out.println(d3);
     
   
         
        
        //float to all
       float f4 = 4;
       double d4 = f4;

    System.out.print("float to all");

     System.out.println(f4);
     System.out.println(d4);
     


    //Narrowing

           //double to all
        double nd = 35.5;
        float nf = (float)nd;
        long nl = (long)nd;
        int ni = (int)nd;
         short ns = (short)nd;
         char nc = (char)nd;
        byte nb = (byte)nd;

          System.out.println(" narrowing double  to all");


         System.out.println(nd);
          System.out.println(nf);
          System.out.println(nl);
         System.out.println(ni);
         System.out.print(ns);
         System.out.println(nc);
         System.out.println(nb);
      



        //float to all
        float nf1 = 33;
        long nl1= (long)nf1;
        int ni1 = (int)nf1;
        short ns1 = (short)nf1;

         char nc1 = (char)nf1;
         byte nb1 = (byte)nf1;
            System.out.println(" narrowing float  to all");

        System.out.println(nf1);
          System.out.println(nl1);
         System.out.println(ni1);
         System.out.print(ns1);
         System.out.println(nc1);
         System.out.println(nb1);

         
          
         //long to all
        
         long nl2 = 33455435l;
         int ni2 = (int)nl2;
         short ns2 = (short)nl2;
         char nc2 = (char)nl2;
          byte nb2 = (byte)nl2;

            System.out.print(" narrowing long  to all");
         
          System.out.println(nl2);
         System.out.println(ni2);
         System.out.print(ns2);
         System.out.println(nc2);
         System.out.println(nb2);

           
    
         
         //int to all
         int ni3 = 566;
         short ns3 = (short)ni3;
         char nc3 =(char)ni3;
         byte nb3 = (byte)ni3;
          System.out.print(" narrowing int  to all");
         //System.out.println(ni3);
         System.out.print(ns3);
         System.out.println(nc3);
         System.out.println(nb3);



          
           // short to all
         short ns4 = 22;
         char nc4 = (char)ns4;
          byte nb4 = (byte)ns4;
             
            System.out.print(" narrowing short  to all");
  
         System.out.print(ns4);
         System.out.println(nc4);
         System.out.println(nb4);


          
            
            // char to all
          char nc5= 'a';
          short ns5 = (short)nc5;
          byte nb5 = (byte)nc5;

           System.out.print(" narrowing char  to all");
         System.out.println(nc5);
         System.out.println(ns5);
         System.out.println(nb5);

 
 



      
      
 
       
    
    
   }

}