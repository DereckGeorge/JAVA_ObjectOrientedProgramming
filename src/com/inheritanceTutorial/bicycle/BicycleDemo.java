// Define a public class named BicycleDemo.
public class BicycleDemo {

    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Create a new MountainBike object with seat height 20, gear 1, and speed 10.
        MountainBike one = new MountainBike(20, 1, 10);

        // Print the seat height, gear, and speed of the mountain bike.
        System.out.println("Seat height = " + one.seatHeight);
        System.out.println("Gear = " + one.gear);
        System.out.println("Speed = " + one.speed);
        
        // Decrease the speed of the mountain bike by 2 using the speedDecrease method.
        one.speedDecrease(2);
        
        // Print the speed of the mountain bike after applying the brake.
        System.out.println("Speed after brake = " + one.speed);
    }
}
