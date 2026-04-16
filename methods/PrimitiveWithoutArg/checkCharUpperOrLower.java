package methods.PrimitiveWithoutArg;

public class checkCharUpperOrLower {

    public static char m1() {

        char ch = 'A';

        if (ch >= 'A' && ch <= 'Z') {
            return 'U';
        } else {
            return 'L';
        }
    }

    public static void main(String[] args) {
        char result = m1();
        System.out.println(result);
    }
}
