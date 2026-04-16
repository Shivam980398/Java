class returnType{

  public static void main(String [] args){

    m1(10,20);
    System.out.println(m2("Shivam","Yadav"));


  }

   public static int m1(int a,int b){

      int c = a+b;
      return c;  
   }
 

     public static String m2(String a,String b){

      String c = a+b;
      return c;
   }
}