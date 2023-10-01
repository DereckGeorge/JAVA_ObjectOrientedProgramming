public class BicycleDemo {

    public static void main(String[] args) {
        MountainBike one = new MountainBike(20, 1, 10);
        System.out.println("Seat height = " + one.seatHeight);
        System.out.println("Gear = " + one.gear);
        System.out.println("Speed = " + one.speed);
        
        one.speedDecrease(2);
        System.out.println("Speed after brake = " + one.speed);

    }
    
}
