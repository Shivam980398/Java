public class Activity2 {
    public static void main(String[] args) {
        System.out.println(10 / 6);
        System.out.println(10 % 6);
        System.out.println(15 / 2);
        System.out.println(15 % 2);
        System.out.println(20 + 3);
        System.out.println(20 * 3);

        System.out.println("Sum of all even numbers from 1 to 20");
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        System.out.println("Product of all odd numbers from 20 to 30");
        int product = 1;
        for (int i = 20; i <= 30; i++) {
            if (i % 2 != 0) {
                product *= i;
            }
        }
        System.out.println(product);

    }
}
