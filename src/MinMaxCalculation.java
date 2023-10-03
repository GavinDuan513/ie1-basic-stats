import java.util.List;
public class MinMaxCalculation {
    public static void findMinMax (List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        int min = numbers.get(0); // Initialize min with the first element
        int max = numbers.get(0); // Initialize max with the first element

        for (int num : numbers) {
            if (num < min) {
                min = num; // Update min if a smaller number is found
            }
            if (num > max) {
                max = num; // Update max if a larger number is found
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
