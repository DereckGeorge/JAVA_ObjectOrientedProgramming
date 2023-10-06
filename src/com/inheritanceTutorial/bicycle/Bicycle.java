// Define a public class named Bicycle.
public class Bicycle {
    // Declare instance variables to store speed and gear values.
    int speed;
    int gear;

    // Constructor for initializing a Bicycle object with given speed and gear values.
    public Bicycle(int speed, int gear) {
        // Assign the provided speed and gear values to the instance variables.
        this.speed = speed;
        this.gear = gear;
    }

    // Method to set the gear of the bicycle to a new value.
    public void setGear(int newValue) {
        // Update the gear value with the new value provided as a parameter.
        gear = newValue;
    }

    // Method to decrease the speed of the bicycle by a specified brakeValue.
    public void speedDecrease(int brakeValue) {
        // Reduce the current speed by the brakeValue.
        speed = speed - brakeValue;
    }

    // Method to increase the speed of the bicycle by a specified speedValue.
    public void speedIncrease(int speedValue) {
        // Increase the current speed by the speedValue.
        speed = speed + speedValue;
    }
}
