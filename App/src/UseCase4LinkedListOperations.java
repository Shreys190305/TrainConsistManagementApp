import java.util.LinkedList;

public class UseCase4LinkedListOperations {
    public static void main(String[] args) {
        // 1. Create a LinkedList<String> for the train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("--- Train Consist Management: Use Case 4 ---");
        System.out.println("Modeling Physical Chaining with LinkedList...\n");

        // 2. Add bogies: Engine, Sleeper, AC, Cargo, Guard
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Coach");
        trainConsist.add("Cargo");
        trainConsist.add("Guard Coach");

        System.out.println("Initial Sequence: " + trainConsist);

        // 3. Insert a Pantry Car at position 2 (after Sleeper)
        System.out.println("\nAction: Inserting 'Pantry Car' at position 2...");
        trainConsist.add(2, "Pantry Car");
        System.out.println("After Insertion: " + trainConsist);

        // 4. Remove the first and last bogie
        // In real life, this might be swapping engines or detaching the guard
        System.out.println("\nAction: Detaching the Engine (First) and Guard Coach (Last)...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // 5. Display the final ordered train consist
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);
        System.out.println("Current Bogie Count: " + trainConsist.size());
    }
}