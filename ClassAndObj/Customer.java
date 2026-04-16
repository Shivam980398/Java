package ClassAndObj;

public class Customer {

    String name = "Shivam";
    int age = 20;
    String city = "Ludhiana";

    public void order() {
        System.out.println("Customer is placing an order.");
    }

  Static String

    public static void main(String[] args) {
        Customer c1 = new Customer();

        System.out.println("Name: " + c1.name);
        System.out.println("Age: " + c1.age);
        System.out.println("City: " + c1.city);
    }

}
