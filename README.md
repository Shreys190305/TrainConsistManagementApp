import java.util.LinkedHashSet;

/**
* Use Case 5: Preserve Insertion Order while ensuring Uniqueness.
* Concept: LinkedHashSet (The "Smart Consist")
  */
  public class UseCase5LinkedHashSetOperations {
  public static void main(String[] args) {
  // 1. Create a LinkedHashSet to represent the train formation
  // It provides the uniqueness of a Set with the ordering of a List.
  LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

       System.out.println("--- Train Consist Management System [UC5] ---");
       System.out.println("Requirement: Maintain unique bogies in physical attachment order.\n");

       // 2. Attach bogies in sequence (Engine to Guard)
       trainFormation.add("Engine (Lead)");
       trainFormation.add("Sleeper Bogie (SL1)");
       trainFormation.add("Cargo Bogie (C1)");
       trainFormation.add("Guard Van (End)");

       // 3. Attempt to attach a duplicate bogie intentionally
       // In reality, the same physical bogie cannot be in two places at once.
       System.out.println("Action: Attempting to re-attach 'Sleeper Bogie (SL1)'...");
       boolean isAdded = trainFormation.add("Sleeper Bogie (SL1)");

       if (!isAdded) {
           System.out.println("Alert: Bogie 'SL1' is already coupled. Duplicate entry rejected.");
       }

       // 4. Display the final formation
       // LinkedHashSet ensures 'Engine' stays at the front and 'Guard' at the back.
       System.out.println("\nFinal Train Formation (Order Preserved):");
       System.out.println("-------------------------------------------");
       int pos = 1;
       for (String bogie : trainFormation) {
           System.out.println("Position " + pos + ": " + bogie);
           pos++;
       }

       // 5. Check the total count
       System.out.println("-------------------------------------------");
       System.out.println("Total Unique Bogies in Consist: " + trainFormation.size());
  }
  }