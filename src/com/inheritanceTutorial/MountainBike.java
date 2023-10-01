public class MountainBike extends Bicycle{
    public int seatHeight;
    
    public MountainBike (int seatHeight, int gear, int speed) {
        super(speed, gear);
        this.seatHeight = seatHeight;
    }

    public void setHeight (int newValue) {
        this.seatHeight = newValue;
    } 
    
}
