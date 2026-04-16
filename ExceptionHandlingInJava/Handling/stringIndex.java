// package Handling;

public class stringIndex {

    public static void main(String[] args) {
        String str = "Hello, World!";

        try {

            System.out.println(str.charAt(20));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
