public class CarDemo {
    public static void main(String[] args) {
        // Create instances of the Car class
        Car myCar = new Car("Toyota", "Camry", 2020);
        Car friendCar = new Car("Honda", "Civic", 2021);

        // Start the cars
        myCar.start();
        friendCar.start();

        // Drive the cars
        myCar.drive(50);
        friendCar.drive(30);

        // Refuel the cars
        myCar.refuel(10);
        friendCar.refuel(5);

        // Display current fuel levels
        System.out.println("My car's fuel level: " + myCar.getFuelLevel());
        System.out.println("Friend's car's fuel level: " + friendCar.getFuelLevel());
    }
}
