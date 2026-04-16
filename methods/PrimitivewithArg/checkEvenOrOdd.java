package methods.PrimitivewithArg;

public class checkEvenOrOdd {

    public static String m1(int a) {

        if (a % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        String result = m1(10);
        System.out.println(result);
    }
}
