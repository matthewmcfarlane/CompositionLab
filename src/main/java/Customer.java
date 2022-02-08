import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<IVehicle> vehicles;

    public Customer(int money) {
        this.money = money;
        this.vehicles = new ArrayList<IVehicle>();
    }

    public int getNumberOfCars() {
        return this.vehicles.size();
    }

    public void buy(IVehicle car) {
        vehicles.add(car);
    }
}
