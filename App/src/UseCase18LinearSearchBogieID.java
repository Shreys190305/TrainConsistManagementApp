public class UseCase18LinearSearchBogieID {

    public static void main(String[] args) {

        // Array of bogie IDs
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchKey = "BG309";

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIDs.length; i++) {

            if (bogieIDs[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie found at position: " + i);
                break; // stop when found
            }
        }

        // If not found
        if (!found) {
            System.out.println("Bogie ID not found");
        }
    }
}