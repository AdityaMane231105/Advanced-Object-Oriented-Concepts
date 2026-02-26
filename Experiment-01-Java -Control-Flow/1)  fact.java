

public class fact{
    public static void main(String[] args) {
        int a=10;

        long factorial = 1;

        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + a + " is: " + factorial);
    }
}
