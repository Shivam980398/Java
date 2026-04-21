// package ClassAndObj;

public class Customer {

    String name = "Shivam";
    int age = 20;
    String city = "Ludhiana";

    static String branch = "CSE";

    public void order() {
        System.out.println("Customer is placing an order.");
    }

    public static void displayDetails() {
        Customer c1 = new Customer();

        System.out.println("Name: " + c1.name);
        System.out.println("Age: " + c1.age);
        System.out.println("City: " + c1.city);
        System.out.println(branch);
        c1.order();

    }

    public static void main(String[] args) {
        displayDetails();
    }

}
