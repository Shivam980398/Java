package methods.voidWithArg;

public class largestOfTwoNumbers {

    public static void m1(int a, int b) {

        if (a > b) {
            System.out.println(a + " is the largest number.");
        } else if (b > a) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    public static void main(String[] args) {
        m1(10, 20);
    }
}
