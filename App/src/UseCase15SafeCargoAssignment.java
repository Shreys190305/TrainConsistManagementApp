public class UseCase15SafeCargoAssignment {

    // Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie Class
    static class GoodsBogie {
        private String type;
        private String cargo;

        public GoodsBogie(String type) {
            this.type = type;
        }

        public void assignCargo(String cargo) {
            try {
                // Safety rule: Rectangular cannot carry Petroleum
                if (type.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException(
                            "Petroleum cannot be assigned to Rectangular bogie"
                    );
                }

                // Assign cargo if safe
                this.cargo = cargo;
                System.out.println("Cargo assigned: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed for " + type + " bogie\n");
            }
        }

        @Override
        public String toString() {
            return type + " Bogie carrying " + cargo;
        }
    }

    // Main Method
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe case
        b1.assignCargo("Petroleum");

        // Unsafe case
        b2.assignCargo("Petroleum");

        // Program continues
        b2.assignCargo("Coal");

        System.out.println("Program continues safely...");
    }
}