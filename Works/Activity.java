public class Activity {
    public static void main(String[] args) {
        System.out.println("Print all the digits of a number");
        int number = 12345;

        while (number > 0) {
            int digit = number % 10;
            System.out.println(digit);
            number /= 10;
        }

        System.out.println("Print sum of all digits of a number");
        number = 12345;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("Sum of all digits: ");
        System.out.println(sum);

        System.out.println("Print product of all digits of a number");
        number = 12345;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }
        System.out.println("Product of all digits: ");
        System.out.println(product);

        // Print sum of all even digits of a number
        System.out.println("Print sum of all even digits of a number");
        number = 12345;
        sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        System.out.println("Sum of all even digits: ");
        System.out.println(sum);

        // Print sum of all odd digits of a number
        System.out.println("Print sum of all odd digits of a number");
        number = 12345;
        sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        System.out.println("Print sum of all odd digits of a number ");
        System.out.println(sum);

        // Print sum of prime digits of a number

        // Print square of a number
        System.out.println("Print square of a number");
        number = 4;
        int square = number * number;
        System.out.println(square);

        System.out.println("Print cube of a number");
        number = 15;

        int cube = number * number * number;
        System.out.println(cube);

        System.out.println("4th power of 5");

        number = 5;
        System.out.println(number * number * number * number);

        System.out.println("6th power of 3");

        number = 3;
        System.out.println(number * number * number * number * number * number);

        System.out.println("2nd power of 6");

        number = 6;
        System.out.println(number * number);

        System.out.println("3rd power of 8");

        number = 8;
        System.out.println(number * number * number);

        System.out.println("Area of rectangle where length is 4.1cm and width is 5.6cm");
        double length = 4.1;
        double width = 5.6;
        System.out.println(length * width);

        System.out.println("Perimeter of rectangle where length is 4.1cm and width is 3.2cm");
        double width2 = 3.2;
        System.out.println(2 * (length + width2));

        System.out.println("Area and perimeter of a square where side is 6cm");
        double side = 6;
        System.out.println(side * side);
        System.out.println(4 * side);

    }
}
