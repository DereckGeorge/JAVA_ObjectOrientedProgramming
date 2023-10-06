// Concrete subclass of Car
public class ElectricCar extends AbstractCar {
    public ElectricCar(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void start() {
        System.out.println("Electric car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Electric car is stopping...");
    }

    // Additional method specific to ElectricCar
    public void chargeBattery() {
        System.out.println("Charging the electric car's battery...");
    }
}
