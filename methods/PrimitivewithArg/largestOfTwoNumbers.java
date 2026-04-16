package methods.PrimitivewithArg;

public class largestOfTwoNumbers {

    public static int m1(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int result = m1(10, 20);

        System.out.println(result);
    }
}
