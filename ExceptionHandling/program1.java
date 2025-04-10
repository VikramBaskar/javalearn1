public class program1 {
    public static void main(String[] args) {
        System.out.println("Program starts");

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Alert: Cannot divide by 0");
        }
    }
}
