// package ClassAndObj.Static_Non_Static;

public class access {

    // non static var
    int x = 9;

    // static var
    static int y = 9;

    // non static method
    public void m2() {
        System.out.println("Non Static");
        m1();

        access B = new access();

        System.out.println("Calling or accessig from non static");
        System.out.println(B.y);
        B.m1();

        System.out.println(x);
        System.out.println(B.x);
    }

    // static method
    public static void m1() {
        System.out.println("Static");
    }

    // static method
    public static void m3() {

        // we have to create object for class to access non static var and method

        access a = new access();

        // used object reference for accessing non static from a static method
        System.out.println(a.x);

        // we can access static var from static method

        // --- directly
        System.out.println(y);

        // --- or using classname
        access.m1();

        // --- or by using objref
        a.m2();

        m1();
    }

    public static void main(String[] args) {
        m3();
    }
}
