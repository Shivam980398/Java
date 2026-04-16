package ClassAndObj;

public class Employee {

    String name = "Shivam";
    int id = 101;
    String department = "Software Development";

    public void work() {
        System.out.println("Employee is working.");
    }

    static String companyName = "Qspider";

    public static void main(String[] args) {
        Employee e1 = new Employee();

        System.out.println("Name: " + e1.name);
        System.out.println("ID: " + e1.id);
        System.out.println("Department: " + e1.department);
        System.out.println("Company Name: " + Employee.companyName);
    }
}
