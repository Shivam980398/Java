package ClassAndObj;

public class User {

    String name = "Shivam";
    String email = "shivam@example.com";
    long phoneNumber = 9779609074l;
    String Address = "Ludhiana";

    public void login() {
        System.out.println("User is logging in.");
    }

    static String platformName = "E-commerce";

    public static void main(String[] args) {
        User u1 = new User();

        System.out.println("Name: " + u1.name);
        System.out.println("Email: " + u1.email);
        System.out.println("Phone Number: " + u1.phoneNumber);
        System.out.println("Address: " + u1.Address);
        System.out.println("Platform Name: " + User.platformName);
    }

}
