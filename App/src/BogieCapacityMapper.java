import java.util.HashMap;
import java.util.Map;

/**
 * BogieCapacityMapper: Implementation of UC6
 * This class handles the mapping between train bogies and their
 * operational capacities using a HashMap structure.
 */
public class BogieCapacityMapper {
    public static void main(String[] args) {

        // 1. Create a HashMap<String, Integer> to store bogie-capacity information
        // Implementation: Storing bogie names as unique keys and capacities as values
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // 2. Entries are inserted into the HashMap using the put() method
        // Mapping Passenger Bogie types
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 24);

        // Mapping Goods Bogie types
        bogieCapacityMap.put("Rectangular", 5000);
        bogieCapacityMap.put("Cylindrical", 3000);

        // 3. System iterates through the map using entrySet()
        System.out.println("Displaying Bogie Capacity Details:");
        System.out.println("----------------------------------");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            // 4. Capacity details are displayed for each bogie
            String bogieName = entry.getKey();
            Integer capacity = entry.getValue();
            System.out.println("Bogie: " + String.format("%-15s", bogieName) + " | Capacity: " + capacity);
        }

        // 5. Program continues
        System.out.println("----------------------------------");
        System.out.println("Processing complete. Program continues...");
    }
}