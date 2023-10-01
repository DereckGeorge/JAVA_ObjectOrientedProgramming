public class Bicycle {
    int speed;
    int gear;

    public Bicycle (int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void setGear (int newValue) {
        gear = newValue;
    }

    public void speedDecrease (int brakeValue) {
        speed = speed - brakeValue;
    }

    public void speedIncrease (int speedValue) {
        speed = speed + speedValue;
    }
}
