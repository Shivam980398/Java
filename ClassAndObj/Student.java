package ClassAndObj;

public class Student {

    String name = "Shivam";
    int age = 20;
    String course = "Web Development";

    public void study() {
        System.out.println("Student is studying.");
    }

    static String instituteName = "Qspider";

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Course: " + s1.course);
        System.out.println("Institute Name: " + Student.instituteName);
    }
}
