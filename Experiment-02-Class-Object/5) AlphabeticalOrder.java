import java.util.Arrays;
import java.util.Scanner;

class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];

        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
