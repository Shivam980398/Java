public class Activity3 {
    public static void main(String[] args) {
        System.out.println("Print factorial of 8");
        int number = 8;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
