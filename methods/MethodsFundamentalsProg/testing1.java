package methods.MethodsFundamentalsProg;

class testing1

{

  static int d;

  public static void add(int a, double b) {

    System.out.println("Add method");

    System.out.println(a + b);
  }

  public static void sub(int a, int b) {

    System.out.println("sub method");

    System.out.println(a - b);
  }

  public static void main(String[] args) {

    System.out.println(d);

    System.out.println("Main method");

    add(20, 30.0);
    sub(30, 40);

  }
}