public class classCast {

    public static void main(String[] args)
            throws classCastException {
        // System.out.println(obj);
        // try {
        String obj = "Hello";
        Integer num = (Integer) obj;

        System.out.println(num);
        // } catch (Exception e) {
        // System.out.println("Error occured bro");
        // }

        System.out.println("obj");
    }
}
