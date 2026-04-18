import java.util.*;
import java.util.stream.Collectors;

public class UseCase8FilterPassengerBogiesByCapacity {

    public static void main(String[] args) {

        // Reuse Bogie objects (same as UC7)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury AC", 80));

        // Display original list
        System.out.println("Original Bogies:");
        bogies.forEach(System.out::println);

        // Filter using Stream API (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Display filtered result
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);
    }
}