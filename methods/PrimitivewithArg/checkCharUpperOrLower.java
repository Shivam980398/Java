package methods.PrimitivewithArg;

public class checkCharUpperOrLower {

    public static String m1(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            return "Uppercase";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Lowercase";
        } else {
            return "Not an alphabet";
        }
    }

    public static void main(String[] args) {
        String result = m1('A');
        System.out.println(result);
    }
}
