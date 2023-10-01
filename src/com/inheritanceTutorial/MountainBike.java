// Define a public class named MountainBike that extends the Bicycle class.
public class MountainBike extends Bicycle {
    // Declare an additional instance variable to store seat height.
    public int seatHeight;

    // Constructor for initializing a MountainBike object with seat height, gear, and speed values.
    public MountainBike(int seatHeight, int gear, int speed) {
        // Call the constructor of the parent class (Bicycle) using 'super' and pass speed and gear values.
        super(speed, gear);
        
        // Initialize the seatHeight of the mountain bike with the provided value.
        this.seatHeight = seatHeight;
    }

    // Method to set the seat height of the mountain bike to a new value.
    public void setHeight(int newValue) {
        // Update the seat height with the new value provided as a parameter.
        this.seatHeight = newValue;
    }
}
