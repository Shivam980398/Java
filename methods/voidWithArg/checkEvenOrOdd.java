package methods.voidWithArg;

public class checkEvenOrOdd {

    public static void m1(int a) {

        if (a % 2 == 0) {
            System.out.println(a + " is even");
        } else {
            System.out.println(a + " is odd");
        }
    }

    public static void main(String[] args) {
        m1(5);
    }
}
