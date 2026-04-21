// package ClassAndObj;

public class Product {

    String name = "Laptop";
    double price = 99999.99;
    String companyName = "Asus";

    public void work() {
        System.out.println("Product is used for studying and for office work.");
    }

    static String category = "Electronics";

    public static void displayDetails() {
        Product p1 = new Product();
        p1.work();
        System.out.println("Name: " + p1.name);
        System.out.println("Price: " + p1.price);
        System.out.println("Company Name: " + p1.companyName);
        System.out.println("Category: " + category);
    }

    public static void main(String[] args) {
        displayDetails();
    }
}
