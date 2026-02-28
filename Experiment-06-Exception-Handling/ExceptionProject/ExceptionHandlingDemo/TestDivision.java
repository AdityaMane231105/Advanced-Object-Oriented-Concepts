package ExceptionHandlingDemo;

public class TestDivision {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        try {
            int result = calc.divide(10, 0);
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program executed successfully.");
    }
}