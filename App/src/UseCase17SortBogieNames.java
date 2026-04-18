import java.util.Arrays;

public class UseCase17SortBogieNames {

    public static void main(String[] args) {

        // Bogie type names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Before sorting
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // After sorting
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}