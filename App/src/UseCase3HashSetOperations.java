import java.util.HashSet;

public class UseCase3HashSetOperations {
    public static void main(String[] args) {
        // 1. Create a HashSet<String> for unique bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        System.out.println("--- Train Consist Management: Use Case 3 ---");
        System.out.println("Enforcing Unique Bogie Identification...\n");

        // 2. Add bogie IDs (including intentional duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");

        // Attempting to add duplicate values
        System.out.println("Action: Attempting to add duplicate ID 'BG101'...");
        bogieIDs.add("BG101");

        System.out.println("Action: Attempting to add duplicate ID 'BG103'...");
        bogieIDs.add("BG103");

        // 3. Print the final set
        System.out.println("\nFinal Unique Bogie ID Registry:");
        System.out.println(bogieIDs);

        // 4. Observe that duplicates are removed automatically
        System.out.println("\nSummary:");
        System.out.println("Total Unique Bogies Registered: " + bogieIDs.size());
        System.out.println("Note: The system automatically ignored redundant entries.");
    }
}
