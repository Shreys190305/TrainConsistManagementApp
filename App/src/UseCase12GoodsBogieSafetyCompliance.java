
import java.util.*;

class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}

public class UseCase12GoodsBogieSafetyCompliance {

    public static void main(String[] args) {

        // Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // Safety check using allMatch
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical")
                                || b.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Output result
        if (isSafe) {
            System.out.println("Train is SAFE for operation");
        } else {
            System.out.println("Train is NOT SAFE for operation");
        }
    }
}
