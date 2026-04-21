package ClassAndObj.Static_Non_Static;

public class accessStatic_Non_Static {

    // non static var
    int x = 9;

    // static var
    static int y = 9;

    // non static method
    public void m2() {
        System.out.println("Non Static");
    }

    // static method
    public static void m1() {
        System.out.println("Static");
    }

    // static method
    public static void m3() {

        // we have to create object for class to access non static var and method
        accessStatic_Non_Static a = new accessStatic_Non_Static();

        // used object reference for accessing non static from a static method
        System.out.println(a.x);

        // we can access static var from static method directly

        System.out.println(y);

        a.m2();
        m1();
    }

    public static void main(String[] args) {
        m3();
    }
}
