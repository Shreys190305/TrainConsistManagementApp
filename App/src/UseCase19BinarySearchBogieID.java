import java.util.Arrays;

public class UseCase19BinarySearchBogieID {

    public static void main(String[] args) {

        // Bogie IDs (can be unsorted)
        String[] bogieIDs = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Search key
        String searchKey = "BG205";

        // Step 1: Sort the array (important for binary search)
        Arrays.sort(bogieIDs);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIDs));

        // Step 2: Binary Search
        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = searchKey.compareTo(bogieIDs[mid]);

            if (comparison == 0) {
                System.out.println("Bogie found at position: " + mid);
                found = true;
                break;
            } else if (comparison < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }

        if (!found) {
            System.out.println("Bogie ID not found");
        }
    }
}