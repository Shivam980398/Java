class typecast {
  public static void main(String[] arg) {

    //widening

    int a = 10;
     //Explicit  
    double d = (double) a;

    //Implicit- compiler auto handles
    double c = a;
    System.out.println(d);
    System.out.println(c);

    char ch = 'a';
    int i = (int) ch;
    int j = ch;
    System.out.println(i);
    System.out.println(j);

    

    //Narrowing

    int e = 65;

    //Explicit
    char f = (char) e;

    //Implicit complier try to auto handle it by puting typecasting operator but due to loss of data , it doesn't want to do any risky task there genrate error :- lossy conversion from big type to small type
    //char f1 = e;
    System.out.println(f);
    //System.out.println(f1);

    double g = 30.4;
    int k = (int)g;
     // int r = g;
    System.out.println(k);
     // System.out.print(r);

  }

}