import java.util.*;

public class UseCase10TotalSeatCalculationUsingReduce {

    public static void main(String[] args) {

        // Reuse bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Calculate total seats using Stream API
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)   // extract capacity
                .reduce(0, Integer::sum); // aggregate

        // Display result
        System.out.println("Total Seating Capacity of Train: " + totalSeats);
    }
}
