public class AbstractCarDemo {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model 3", 2022);

        tesla.displayInfo();
        tesla.start();
        tesla.chargeBattery();
        tesla.stop();
    }
}
