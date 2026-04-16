package methods.voidWithoutArg;

public class checkCharUpperOrLower {

    public static void m1() {

        char ch = 'A';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } else {
            System.out.println(ch + " is not an alphabetic character.");
        }
    }

    public static void main(String[] args) {
        m1();
    }
}
