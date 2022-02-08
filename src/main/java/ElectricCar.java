public class ElectricCar extends Vehicle {


    private int price;
    private Battery battery;

    public ElectricCar(String make, String model, String colour, Battery battery, int price) {
        super(make, model, colour);
        this.battery = battery;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getBatteryCapacity() {
        return this.battery.getCapacity();
    }
}
