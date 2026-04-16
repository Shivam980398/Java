package methods.voidWithArg;

public class checkCharUpperOrLower {

    public static void m1(char a) {

        if (a >= 'A' && a <= 'Z') {
            System.out.println(a + " is an uppercase letter");
        } else if (a >= 'a' && a <= 'z') {
            System.out.println(a + " is a lowercase letter");
        } else {
            System.out.println(a + " is not an alphabet");
        }
    }

    public static void main(String[] args) {
        m1('A');
    }
}
