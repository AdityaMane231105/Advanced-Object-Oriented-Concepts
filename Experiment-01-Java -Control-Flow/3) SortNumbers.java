import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        int[] numbers = {42, 17, 89, 23, 56, 12, 78, 34, 67, 91};
        
        Arrays.sort(numbers);
        
        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}