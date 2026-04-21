// package ClassAndObj.Static_Non_Static;

public class nonStaticToNonStatic {
    int r = 9;
    static int t = 20;

    public static void m1() {

    }

    public void m2() {

    }

    public void m4() {

        // non static var or method

        // --directly
        System.out.println(r);
        m2();
        // -- using objref
        nonStaticToNonStatic a = new nonStaticToNonStatic();
        System.out.println(a.r);
        a.m2();

        // using this
        System.out.println(this.r);

        // static

    }

    public static void main(String[] args) {
        nonStaticToNonStatic A = new nonStaticToNonStatic();
        A.m4();
    }
}
