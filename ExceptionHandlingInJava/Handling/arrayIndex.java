// package Handling;

public class arrayIndex {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };
        try {

            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println("Cannot access element of undefined index");
        }
    }
}
