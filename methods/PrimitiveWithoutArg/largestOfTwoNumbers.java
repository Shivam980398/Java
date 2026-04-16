package methods.PrimitiveWithoutArg;

public class largestOfTwoNumbers {

    public static int m1() {

        int a = 10;
        int b = 20;

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int result = m1();
        System.out.println(result);
    }
}
