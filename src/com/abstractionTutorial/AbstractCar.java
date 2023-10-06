// Abstract class definition for a Car
public abstract class AbstractCar {
    // Common attributes for all cars
    private String brand;
    private String model;
    private int year;

    // Constructor for the Car class
    public AbstractCar(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Abstract method for starting the car
    public abstract void start();

    // Abstract method for stopping the car
    public abstract void stop();

    // Common method for getting car information
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
