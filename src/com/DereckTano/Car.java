// Define the Car class
class Car {
    // Instance variables
    private String make;
    private String model;
    private int year;
    private double fuelLevel;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelLevel = 0.0; // Initialize fuel level to zero
    }

    // Method to start the car
    public void start() {
        System.out.println("Starting the " + year + " " + make + " " + model);
    }

    // Method to drive the car
    public void drive(int distanceInMiles) {
        if (fuelLevel > 0) {
            System.out.println("Driving " + distanceInMiles + " miles.");
            fuelLevel -= (distanceInMiles * 0.1); // Assume 1 mile consumes 0.1 units of fuel
        } else {
            System.out.println("Out of fuel. Please refuel.");
        }
    }

    // Method to refuel the car
    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Refueled " + amount + " units of fuel. Current fuel level: " + fuelLevel);
    }

    // Method to get the current fuel level
    public double getFuelLevel() {
        return fuelLevel;
    }
}

