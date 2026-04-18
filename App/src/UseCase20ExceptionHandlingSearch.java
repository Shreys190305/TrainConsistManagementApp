public class UseCase20ExceptionHandlingSearch {

    public static void main(String[] args) {

        // Bogie IDs (try empty array to test exception)
        String[] bogieIDs = {};

        String searchKey = "BG101";

        try {
            boolean result = searchBogie(bogieIDs, searchKey);

            if (result) {
                System.out.println("Bogie found");
            } else {
                System.out.println("Bogie not found");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Search method with fail-fast validation
    public static boolean searchBogie(String[] bogieIDs, String key) {

        // Fail-fast check
        if (bogieIDs == null || bogieIDs.length == 0) {
            throw new IllegalStateException("No bogies available to search");
        }

        // Linear search
        for (String id : bogieIDs) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}
