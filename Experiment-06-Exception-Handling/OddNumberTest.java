class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberTest {

    static void checkNumber(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Odd number is not allowed: " + num);
        } else {
            System.out.println("Even number entered: " + num);
        }
    }

    public static void main(String[] args) {
        int number = 5;

        try {
            checkNumber(number);
        } catch (OddNumberException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues normally.");
    }
}