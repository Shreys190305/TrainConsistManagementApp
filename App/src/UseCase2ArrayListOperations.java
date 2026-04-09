import java.util.ArrayList;

public class UseCase2ArrayListOperations {
    public static void main(String[] args) {
        // 1. Create an ArrayList<String> for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        System.out.println("--- Train Consist Management: Use Case 2 ---");

        // 2. Add bogies: Sleeper, AC Chair, First Class
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 3. Print the list after insertion
        System.out.println("Initial Train Consist: " + passengerBogies);

        // 4. Remove one bogie (for example AC Chair)
        System.out.println("\nRemoving 'AC Chair' from the consist...");
        passengerBogies.remove("AC Chair");

        // 5. Use contains() to check if Sleeper exists
        System.out.println("Checking existence of 'Sleeper' bogie...");
        boolean exists = passengerBogies.contains("Sleeper");

        if (exists) {
            System.out.println("Status: Sleeper bogie is present in the train.");
        } else {
            System.out.println("Status: Sleeper bogie is missing.");
        }

        // 6. Print final list state
        System.out.println("\nFinal Train Consist State: " + passengerBogies);
        System.out.println("Total Bogies: " + passengerBogies.size());
    }
}
