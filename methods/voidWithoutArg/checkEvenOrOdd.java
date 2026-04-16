package methods.voidWithoutArg;

public class checkEvenOrOdd {

    public static void m1() {

        int num = 5;

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    public static void main(String[] args) {
        m1();
    }
}
